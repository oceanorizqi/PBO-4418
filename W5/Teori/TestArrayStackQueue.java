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
public class TestArrayStackQueue {
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println ("[Array List]");
        ArrayList new_array = new ArrayList();
        new_array.append(1);
        new_array.append(2);
        new_array.append(3);
        new_array.append(4);
        new_array.append(5);
        new_array.append(6);
        new_array.ShowData();
        System.out.println("--PEMISAH--");
        new_array.append(7);
        new_array.ShowData();
        System.out.println("--PEMISAH--");
        new_array.pop();
        new_array.ShowData();
        System.out.println("--PEMISAH--");
        new_array.UbahData(0,9);
        new_array.ShowData();
        System.out.println("\n");
        
        System.out.println("[Stack List]");
        StackList new_stack = new StackList();
        new_stack.append(1);
        new_stack.append(2);
        new_stack.append(3);
        new_stack.append(4);
        new_stack.append(5);
        new_stack.append(6);
        new_stack.ShowData();
        System.out.println("--PEMISAH--");
        new_stack.append(7);
        new_stack.ShowData();
        System.out.println("--PEMISAH--");
        new_stack.pop();
        new_stack.ShowData();
        System.out.println("--PEMISAH--");
        new_stack.UbahData(2,14);
        new_stack.ShowData();
        System.out.println("\n");
        
        System.out.println("[Queue List]");
        QueueList new_queue = new  QueueList();
        new_queue.append(1);
        new_queue.append(2);
        new_queue.append(3);
        new_queue.append(4);
        new_queue.append(5);
        new_queue.append(6);
        new_queue.append(7);
        new_queue.ShowData();
        System.out.println("--PEMISAH--");
        new_queue.pop();
        new_queue.ShowData();
        System.out.println("--PEMISAH--");
        new_queue.UbahData(4,17);
        new_queue.ShowData();
        System.out.println("SELESAI");
    }
}
