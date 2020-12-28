package december17Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph {

  HashMap<String, HashMap<String, Integer>> graph = new HashMap<>();

  private boolean containsVertex(String v) {
    if (graph.containsKey(v)) {
      return true;
    }else {
      graph.put(v, new HashMap<>());
    }
    return true;
  }
  public void addEdge(String v1, String v2, int wt) {
    if (containsVertex(v1) && containsVertex(v2)) {
        graph.get(v1).put(v2, wt);
        graph.get(v2).put(v1, wt);
    }
  }

  public void display() {
    ArrayList<String> cities = new ArrayList<String>(graph.keySet());

    for(String city: cities){
      System.out.print(city + "---->");
      ArrayList<String> connectedCities = new ArrayList<>(graph.get(city).keySet());
      for (String connectedCity : connectedCities) {
        System.out.print("(" + connectedCity + ", " + graph.get(city).get(connectedCity) + ")");
      }
      System.out.println();
    }
  }

  public void printAllPaths(String s, String d) {
    HashSet<String> visited = new HashSet<>();
    printAllPaths(s, d, "", visited);
  }

  private void printAllPaths(String src, String dest, String path, HashSet<String> visited) {

    if(src.equals(dest)) {
      System.out.print(path + dest);
      return;
    }

    visited.add(src);

    ArrayList<String> connectedCities = new ArrayList<>(graph.get(src).keySet());

    for(String connectedCity: connectedCities) {
        if (visited.contains(connectedCity)) {
          continue;
        }
        printAllPaths(connectedCity, dest, path+src + "--->", visited);
    }
    visited.remove(src);
  }

  public boolean ifPathExists(String s, String d) {
    HashSet<String> visited = new HashSet<>();
    boolean res = false;
    return ifPathExists(s, d, visited);
  }

  private boolean ifPathExists(String src, String dest, HashSet<String> visited) {

    if(src.equals(dest)) {
      return true;
    }

    visited.add(src);

    ArrayList<String> neighbours = new ArrayList<>(graph.get(src).keySet());

    for(String neighbour: neighbours) {
      if (visited.contains(neighbour)) {
        continue;
      }
      boolean ans = ifPathExists(neighbour, dest, visited);
      if(ans == true){
        return true;
      }
    }
    return false;
  }

  public void DFSTraversal() {
    ArrayList<String> cities = new ArrayList<>(graph.keySet());
    HashSet<String> visited = new HashSet<>();
    for(String city : cities) {
      if(visited.contains(city)){
        continue;
      }
      DFSTraversal(city, visited);
    }
  }

  private void DFSTraversal(String city, HashSet<String> visited) {
    visited.add(city);
    System.out.print(city+ "-->");
    ArrayList<String> neighbours = new ArrayList<>(graph.get(city).keySet());

    for(String neighbour: neighbours) {
      if(visited.contains(neighbour)) {
        continue;
      }
      DFSTraversal(neighbour, visited);
    }
  }

  public void BFSTraversal() {
    ArrayList<String> cities = new ArrayList<>(graph.keySet());
    HashSet<String> visited = new HashSet<>();
    for(String city : cities) {
      if(visited.contains(city)){
        continue;
      }
      LinkedList<String> q = new LinkedList<>();
      q.addLast(city);
      while (q.size() > 0){
        String currCity  = q.removeFirst();
        if(visited.contains(currCity)){
          continue;
        }
        visited.add(currCity);
        System.out.print(currCity+ ".....");
        ArrayList<String> neighbours = new ArrayList<>(graph.get(currCity).keySet());
        for(String neighbour: neighbours) {
          if(visited.contains(neighbour)){
            continue;
          }
          q.addLast(neighbour);
        }
      }
    }
  }

  public int shortestPathUnweighted(String src, String dest) {
    HashSet<String> visited = new HashSet<>();
    LinkedList<String> q = new LinkedList<>();
    q.addLast(src);
    q.addLast(null);
    int level = 0;
    while(!(q.size() == 1 && q.getFirst() == null)) {
      String currCity = q.removeFirst();

      if(currCity == null){
        level++;
        q.addLast(null);
      }

      if(visited.contains(currCity)){
        continue;
      }

      if(currCity.equals(dest)){
        return level;
      }

      visited.add(currCity);
      ArrayList<String> neighbours = new ArrayList<>(graph.get(currCity).keySet());
      for (String neighbour: neighbours){
        if(visited.contains(neighbour)){
          continue;
        }
        q.addLast(neighbour);
      }
    }
    return -1;
  }

//  public void roadMapToStudy() {
//    HashSet<String> viisted = new HashSet<>();
//    Stack<String> sorted = new Stack<>();
//
//    for()
//  }

//  public boolean isBipartite(){}
  private boolean isBipartite(String s, HashMap<String, Integer> visited) {
    LinkedList<String> curr = new LinkedList<>();
    LinkedList<String> next = new LinkedList<>();

    curr.addLast(s);
    int level = 1;
    while(curr.size() > 0){
      String v = curr.removeFirst();
      if (visited.containsKey(v) == true) {
        int oddLevel = visited.get(v);
        if (oddLevel % 2 != level %2){
          return false;
        }
      }

      visited.put(v, level);
      for (String neighbour: graph.get(v).keySet()) {
        if (visited.containsKey(neighbour) == false){
          next.addLast(neighbour);
        }
      }

      if(curr.size() == 0){
        curr = next;
        next = new LinkedList<String>();
        level++;
      }
    }
    return true;
  }

  public ArrayList<String> getConnectedComponenets(String s) {
    HashSet<String> visited = new HashSet<>();
    ArrayList<String> paths = new ArrayList<>();

    for(String vertex : graph.keySet()){
      LinkedList<String> q = new LinkedList<>();
      q.addLast(vertex);
      String str = "";
      while (q.size() > 0){
        String v = q.removeFirst();
        if(visited.contains(v) == true){
          continue;
        }

        visited.add(v);
        str +=v;
        for(String neighbour: graph.get(v).keySet()){
          if (visited.contains(neighbour) == false){
            q.addLast(neighbour);
          }
        }
        paths.add(str);
      }
    }
    return paths;
  }

  public boolean isConnected(String s) {
    HashSet<String> visited = new HashSet<>();
    ArrayList<String> paths = new ArrayList<>();

    for(String vertex : graph.keySet()){
      LinkedList<String> q = new LinkedList<>();
      q.addLast(vertex);
      String str = "";
      while (q.size() > 0){
        String v = q.removeFirst();
        if(visited.contains(v) == true){
          continue;
        }

        visited.add(v);
        str +=v;
        for(String neighbour: graph.get(v).keySet()){
          if (visited.contains(neighbour) == false){
            q.addLast(neighbour);
          }
        }
        if(paths.size() >1){
          return false;
        }else{
          paths.add(str);
        }
      }
    }
    return true;
  }

  public void hamiltonianPaths(String s){
    hamiltonianPaths(s, new HashSet<>(), s, s);
  }

  private  void hamiltonianPaths(String s, HashSet visited, String s1, String psf) {
    visited.add(s);
    if (visited.size() == graph.size()){
      System.out.println(psf);
    }

    for (String neighbour: graph.get(s).keySet()){
      if (visited.contains(neighbour) == false) {
        hamiltonianPaths(neighbour, visited, s, psf + neighbour);
      }
    }
  }

  public void hamiltonianCycle(String s){
    hamiltonianPaths(s, new HashSet<>(), s, s);
  }

  private  void hamiltonianCycle(String s, HashSet<String> visited, String psf, String oSource) {
    visited.add(s);
    if (visited.size() == graph.size()){
      if(graph.get(oSource).containsKey(s)){
        System.out.println(psf+oSource);
      }
      System.out.println(psf);
    }

    for (String neighbour: graph.get(s).keySet()){

      if (visited.contains(neighbour) == false) {
        hamiltonianPaths(neighbour, visited, s, psf + neighbour);
      }
    }
  }


}
