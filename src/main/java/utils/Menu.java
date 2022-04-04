package utils;

public class Menu {
    ConsoleScanner cs = new ConsoleScanner();
    Runner runner;
    static int start;
    static int end;
    public void menu() {
        constructorRunner();
        int choiceFolder;
        int choice;

        do {
            showMenu();
            choice = cs.readInt();
            switch (choice) {
                case 1:
                    run();
                    break;
                case 2:
                    taskList();
                    break;
                case 3:
                    showTaskDetails();
                    break;
                case 4:
                    usersList();
                    break;
                case 5:
                    setImplementationByUser();
                    break;

            }
        } while (choice != 0);
        System.out.println("Thank you! Hope to see you again:)");

    }
    private void constructorRunner() {
        System.out.println("Hello!\nTo continue, please, choose folder:");
        usersList();
        int choose;
        do {
            choose = cs.readInt();
            if (choose < 1 || choose > 7) {
                System.out.println("Please, enter a number from 1 to 7.");
            }
        } while (choose < 1 || choose > 7);
        runner = new Runner(Folders.getFolderById(choose));
        start = Folders.getFolderById(choose).getStart();
        end = Folders.getFolderById(choose).getEnd();
        System.out.println();
    }

    public void taskList() {
        for(Tasks t: Tasks.values()) {
            if(t.getId()>= start&t.getId()<= end) System.out.println(t.getId() + " " + t.getTaskName());
        }

        System.out.println();
    }

    public void showMenu() {
        System.out.println("1 - Run task");
        System.out.println("2 - Show task list");
        System.out.println("3 - Show task details");
        System.out.println("4 - Show folders list");
        System.out.println("5 - Change folders");
        System.out.println("0 - Exit");
        System.out.println();
        System.out.println("Enter your choice:\n");
    }

    public void showTaskDetails() {
        System.out.println("Enter number of method from 1 to 72");
        System.out.println(Tasks.getDescription(cs.readInt()));
        System.out.println();
    }

    public void run() {
        System.out.println();
        System.out.println("First you need to choose a task.");
        System.out.println("Enter number of task:");
        int choose = cs.readInt();
        while (choose > 72 || choose < 1) {
            System.out.println("Enter from 1 to 72");
            choose = cs.readInt();
        }
        runner.setTasks(choose);
        System.out.println("--------------------------------------------------");
    }

    public void usersList() {
        System.out.println();
        System.out.println("List of folders:");
        for (Folders user : Folders.values()) {
            System.out.println(user.getId() + " " + user.getFolderName() + " " + user.getCountTask());
        }
    }

    public void setImplementationByUser() {
        usersList();
        System.out.println("Make your choice:");
        int choose;
        do {
            choose = cs.readInt();
        } while (choose < 1 || choose > 7);
        runner.setUsers(Folders.getFolderById(choose));
        start = Folders.getFolderById(choose).getStart();
        end = Folders.getFolderById(choose).getEnd();
        System.out.println();
    }
}
