package com.Assignment_2;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

class Graph
{
    private int V;

    private LinkedList<Integer> adj[]; //Adjacency List


    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v,int u){
        adj[v].add(u);
        adj[u].add(v);
    }

    Boolean isCyclicUtil(int v, Boolean visited[], int parent)
    {

        visited[v] = true;
        Integer i;


        Iterator<Integer> it = adj[v].iterator();
        while (it.hasNext())
        {
            i = it.next();


            if (!visited[i])
            {
                if (isCyclicUtil(i, visited, v))
                    return true;
            }


            else if (i != parent)
                return true;
        }
        return false;
    }


    Boolean isTree()
    {

        Boolean visited[] = new Boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;


        if (isCyclicUtil(0, visited, -1))
            return false;


        for (int u = 0; u < V; u++)
            if (!visited[u])
                return false;

        return true;
    }



}
public class GraphTreeOrNot {
    public static void main(String[] args) {
        Graph g1 = new Graph(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        if(g1.isTree())
            System.out.println("Graph is  Tree");
        else
            System.out.println("Graph is not a Tree");


        Graph g2 = new Graph(5);
        g2.addEdge(1, 0);
        g2.addEdge(0, 2);
        g2.addEdge(2, 1);
        g2.addEdge(0, 3);
        g2.addEdge(3, 4);

        if(g2.isTree())
            System.out.println("Graph is a Tree");
        else
            System.out.println("Graph is not a Tree");


        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        if(g.isTree())
            System.out.println("Graph is a Tree");
        else
            System.out.println("Graph is not a Tree");
    }
}
