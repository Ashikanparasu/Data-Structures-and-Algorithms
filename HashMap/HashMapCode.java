import java.util.*;
public class HashMapCode {

    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }

        }
            private int n ;
            private int N;
            private LinkedList<Node> bucket[];

            @SuppressWarnings("unchecked")
            public HashMap(){

                this.n = 4;
               

                this.buckets = new LinkedList<>();
                for(int i = 0; i<4; i++){
                    this.buckets[i] = new LinkedList<>();

                }

            }

            private int hasFunction(K key){

                int hc = key.hashCode();
                return math.abs(hc) % N;


            }

            private int SearchInLL(K key , int bi){
                LinkedList<Node> ll = bucket[bi];

                int di = 0;

                for(int i = 0 ; i<ll.size(); i++){
                    Node node = ll.get(i);
                    if(node.key == key){
                        return di;
                    }
                    di++;
                }
                return -1;
            }

            private void rehash(){
                LinkedList <Node> oldBuck[] = bucket;
                bucket = new LinkedList[N*2];
                N= 2*N;

                for(int i =0; i <buckets.length;i++){
                    bucket[i] = 
                }
            }

            public void put(K key, V value){

                int bi = hashFunction(key);
                int di = SearchInLL(key);

                if(si!= -1){
                    Node node = bucket[bi].get(di);
                    node.value = value;
                }else{
                    bucket[bi].add(new Node(key,value));
                    n++;

                }

                double lambda = (double) n/N;
                if(lambda >2.0);
                rehash();

            }
            public boolean containKey(K key){
                return false;
            }

            public static void contain(K key){
                return false;
            }
        
    }
    public static void main(String [] args){

    }

}


    

