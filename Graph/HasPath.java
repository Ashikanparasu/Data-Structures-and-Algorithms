import java.util.*;
public class HasPath {


    public static class edge{
        int src;
        int dec;
        int wei;

        public edge(int src,int dec,int wei){
            this.src=src;
            this.dec=dec;
            this.wei=wei;
        }
    }

    public static ArrayList<edge> [] createGraph(int V){

        ArrayList<edge> [] graph = new ArrayList[7];

        for(int i = 0; i < graph.length; i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new edge(0,1,1));
        graph[0].add(new edge(0,2,1));

        graph[1].add(new edge(1,0,1));
        graph[1].add(new edge(1,3,1));

        graph[2].add(new edge(2,0,1));
        graph[2].add(new edge(2,4,1));

        graph[3].add(new edge(3,1,1));
        graph[3].add(new edge(3,4,1));
        graph[3].add(new edge(3,5,1));

        graph[4].add(new edge(4,2,1));
        graph[4].add(new edge(4,3,1));
        graph[4].add(new edge(4,5,1));

        graph[5].add(new edge(5,3,1));
        graph[5].add(new edge(5,4,1));
        graph[5].add(new edge(5,6,1));

        graph[6].add(new edge(6,5,1));

        return graph;

    }
    public static void main(String [] args){

        ArrayList<edge>[] graph = createGraph(7);


    }
    
}
