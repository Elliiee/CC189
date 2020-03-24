import java.util.LinkedList;

/*
Route Between Nodes:
Given a directed graph, design an algorithm to find out whether
there is a route between two nodes.
 */
public class _4_1 {
    /*
    This problem can be solved by simple graph traversal.
    DFS, BFS
    We should mark any node found in the course of the algorithm as already visited
    to avoid cycles and repetition of the nodes.
     */
    // BFS
    enum State {Unvisited, Visited, Visiting; }

    boolean search(Graph g, Node start, Node end){
        if (start == end) return true;

        LinkedList<Node> q = new LinkedList<>();

        for (Node u : g.getNodes()){
            u.state = State.Unvisited;  // mark all the nodes as unvisited at first
        }

        start.state = State.Visiting;
        q.add(start);
        Node u;
        while (!q.isEmpty()){
            u = q.removeFirst();
            if (u != null){
                for (Node v : u.getAdjacent()){
                    if (v.state == State.Unvisited){
                        if (v == end){
                            return true;
                        } else {
                            v.state = State.Visiting;
                            q.add(v);
                        }
                    }
                }
                u.state = State.Visited;
            }
        }
        return false;
    }
}
