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
                    FoldersList();
                    break;
                case 5:
                    setNewFolder();
                    break;

            }
        } while (choice != 0);
        System.out.println("Thank you! Hope to see you again:)");

    }
    private void constructorRunner() {
        System.out.println("Hello!\nTo continue, please, choose folder with tasks:");
        FoldersList();
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
        System.out.println("First you need to choose a task.");
        System.out.println("Enter number of task from " + start +" to " + end);
        int choose = cs.readInt();
        while (choose > end || choose < start) {
            System.out.println("Enter from " + start + " to " + end);
            choose = cs.readInt();
        }
        System.out.println("Task №" + choose + " " + Tasks.getTaskNameById(choose));
        System.out.println("Description:");
        System.out.println(Tasks.getDescription(choose));
        System.out.println();
    }

    public void run() {
        System.out.println();
        System.out.println("First you need to choose a task.");
        System.out.println("Enter number of task in range " + start + "-" + end +":");
        int choose = cs.readInt();
        while (choose > end || choose < start) {
            System.out.println("Enter from " + start + " to " + end);
            choose = cs.readInt();
        }
        System.out.println("Task №" + choose + " " + Tasks.getTaskNameById(choose));
        System.out.println("Description:");
        System.out.println(Tasks.getDescription(choose));
        runner.setTasks(choose);
        System.out.println("--------------------------------------------------");
    }

    public void FoldersList() {
        System.out.println();
        System.out.println("List of folders:");
        for (Folders user : Folders.values()) {
            System.out.println(user.getId() + " " + user.getFolderName() + user.getCountTask());
        }
    }

    public void setNewFolder() {
        FoldersList();
        System.out.println("Make your choice:");
        int choose;
        do {
            choose = cs.readInt();
        } while (choose < 1 || choose > 7);
        runner.setFolders(Folders.getFolderById(choose));
        start = Folders.getFolderById(choose).getStart();
        end = Folders.getFolderById(choose).getEnd();
        System.out.println();
    }
}
