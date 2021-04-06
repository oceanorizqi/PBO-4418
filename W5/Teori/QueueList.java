/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngoding.array_stack_queue;

/**
 *
 * @author asus
 */
public class QueueList extends Data_rate {
    public void append(int data){
        try{
            for (int x = 0; x < Data_rate.length+1; x++){
                if (Data_rate[x] == 0){
                    Data_rate[x] = data;
                    break;
                }
                
                if (x == Data_rate.length+1){
                    throw new Exception("");
                }
            }
        } catch(Exception e){
            int len = Data_rate.length;
            int[] temp_node = new int[len+1];
            for (int x = 0; x < len; x++){
                temp_node[x] = Data_rate[x];
            }
            temp_node[len] = data;
            Data_rate = temp_node.clone();
        }
    }
    
    public void pop(){
        int len = Data_rate.length;
        int[] temp_node = new int[len-1];
        for (int i = 0; i < temp_node.length; i++){
            temp_node[i] = Data_rate[i+1];
        }
        Data_rate = temp_node.clone();
    }
    
    public void UbahData(int index, int data){
        Data_rate[index] = data;
    }
    
    public void ShowData(){
        for (int x = 0; x < Data_rate.length; x++){
            System.out.println(Data_rate[x]);
        }
    }
}
