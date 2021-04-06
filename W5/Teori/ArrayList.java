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
public class ArrayList extends Data_rate{
    public void append(int data){
        for (int x = 0; x < Data_rate.length; x++){
            if (Data_rate[x] == 0){
                Data_rate[x] = data;
                break;
            }
        }
    }
    
    public void append(int index, int data){
        Data_rate[index] = data;
    }
    
    public void pop(){
        for (int x = Data_rate.length-1; x > 0; x--){
            if (Data_rate[x] != 0){
                Data_rate[x] = 0;
                break;
            }
        }
    }
    
    public void pop(int index){
        Data_rate[index] = 0;
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
