class BellmanFord{

  public static int[] CalculateDistance(int V,int src,int[][]edges){

    int dis[]=new int[V];
    int max=9;
    for(int i=0;i<V-1;i++){

      dis[i]=max;
      
    }
    dis[src]=0;
    int u,v,wt;
    for(int i=0;i<V-1;i++){

      for(int j=0;j<edges.length;j++){

        u=edges[j][0];
        v=edges[j][1];
        wt=edges[j][2];


        if(dis[u]!=max&&dis[v]>dis[u]+wt){

          dis[v]=dis[u]+wt;
        }
      }}

      for(int j=0;j<edges.length;j++){

          u=edges[j][0];
 
        v=edges[j][1];
         wt=edges[j][2];
 
         if(dis[u]!=max&&dis[v]>dis[u]+wt){ 
            return new int[0];
          }


      }
      return dis;
    }
  
public static void main(String[] args){

  int V=3;
  int E=3;
int edges[][]={{0,1,5},{0,2,-2},{2,1,-3}};
int src=0;

int res[]=CalculateDistance(V,src,edges);
if(res.length==0){


  System.out.println("Negative only");
}
else{
  System.out.println("Vertex\tDistance");
for(int i=0;i<V;i++){
System.out.println(i+ "\t\t"+res[i]);

}

}
}
}
