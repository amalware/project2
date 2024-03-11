import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {






    public static Scanner scanner = new Scanner(System.in); //to input stuff
    public static void newTask(ArrayList<Task> a){

            System.out.println("Task name:");
            String taskName = scanner.nextLine();

            System.out.println("Task description:");
            String taskDescription = scanner.nextLine();

            System.out.println("Task priotirity:");
            int taskPriority = scanner.nextInt();
            scanner.nextLine();
            a.add(new Task(taskName, taskDescription, taskPriority));

    };
    public static void main(String[] args) {


        ArrayList<Task> tasks = new ArrayList<>(); //p2, pass in arrays






        System.out.println("Please choose an option:\n(1) Add a task. \n(2) Remove a task. \n(3) Update a task. \n(4) List all tasks. \n(0) Exit.");
        int selection = scanner.nextInt(); //initialize selection for loop, if 0, it will skip over the loop
        scanner.nextLine();
        String task;
        Task tester = new Task("test","just to test",1);

        while (selection != 0){ //Continue loop until user exits




            switch (selection) { //Caters to each user selection
                case 1: //Add task
                    newTask(tasks);
                    //addTask(tasks); project 1 add task method
                    break;
                case 2: //Remove task
                    removeTask(tasks);


                    break;
                case 3: //update task
                    updateTask(tasks);


                    break;
                case 4: //List all tasks
                    System.out.println("Your current list of tasks is:");
                    System.out.println(tasks);
                    break;
            }
            System.out.println("Please choose an option:\n(1) Add a task. \n(2) Remove a task. \n(3) Update a task. \n(4) List all tasks. \n(0) Exit.");
            selection = scanner.nextInt();
            //Continue or break the loop
        }; //exit the loop


        System.out.println("Goodbye!");//end program
    }
    public static ArrayList addTask(ArrayList a){
        System.out.println("Add a task!");
        scanner.nextLine(); //Prevents an "eating an enter" error...
        String b = scanner.nextLine();
        a.add(b);
        System.out.println("You added the task:");
        System.out.println(b);
        System.out.println("Your new list of tasks is:");
        System.out.println(a);
        return a;
    } //from project 1
    public static ArrayList removeTask(ArrayList a){
        System.out.println("Which task would you like to remove? (Please name the index, starting from 0)");
        System.out.println(a);
        scanner.nextLine(); //Prevents an "eating an enter" error...
        int b = scanner.nextInt();
        a.remove(b);
        System.out.println("Your new list of tasks is:");
        System.out.println(a);
        return a;
    }


    public static ArrayList updateTask(ArrayList a){
        System.out.println("Which task would you like to update? (Please name the index, starting from 0)");
        System.out.println(a);
        scanner.nextLine(); //Prevents an "eating an enter" error...
        int b = scanner.nextInt(); //get index
        System.out.println("What would you like to update it to?");
        scanner.nextLine();
        String c = scanner.nextLine(); //get value
        a.set(b, c);
        System.out.println("Your new list of tasks is:");
        System.out.println(a);
        return a;
    }






}



