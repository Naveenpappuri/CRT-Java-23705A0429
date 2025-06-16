class Graph {
    int [][] graph;
    int vertices;
    boolean isDirected;
    public static void main(String[] args){
        Graph graph = new Graph(4,false);
        graph.addEdge (0,1,10);
        graph.addEdge (0,2,20);
        graph.addEdge (0,3,30);
        graph.addEdge (1,2,15);
        graph.printGraph();
        graph.havingEdge(0,2);
        
        
    }
    Graph(int vertices,boolean isDirected){
        graph = new int[vertices][vertices];
        this.vertices = vertices;
        this.isDirected = isDirected;
    }
    void addEdge(int src, int dest,int weight){
        if(isValid(src,dest)){
            graph[src][dest] = weight;
            if(!isDirected){
              graph[dest][src] = weight;  
            }
            
        }
        else {
            System.out.println("Invalid source or Destination");
        }
    }
    void removeEdge(int src, int dest){
        if(isValid(src,dest)){
            graph[src][dest] = 0;
            if(!isDirected){
                graph[dest][src] = 0;
            }
            
        }
        else {
            System.out.println("Invalid source or Destination");
        }
    }
    boolean isValid(int src,int dest){
        return src>=0 && dest >= 0 && src < vertices && dest < vertices && src != dest;
    }
    boolean havingEdge(int src, int dest){
        if(isValid(src,dest)){
            if(graph[src][dest] != 0){
                
                System.out.println(src +" and "+ dest +" having an Edge" );
                return true;
            } 
            
            else {
               
                System.out.println(src +" and "+ dest +" does't having an Edge");
                 return false;
            }
        }
        System.out.println("Invalid source and destination");
        return false;
    }
    

void printGraph(){
    System.out.println("Matrix representation of graph: ");
    for(int i=0; i< vertices; i++){
        for(int j=0; j<vertices; j++){
            System.out.print(graph[i][j]+"  ");
        }
        System.out.println();
        
    }
}
}