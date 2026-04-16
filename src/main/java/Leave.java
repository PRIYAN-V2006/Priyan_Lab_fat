package main.java;

public class Leave {
    public static void main(String[] args) {
        System.out.println("Leave Management System is Running...");
        
        // This infinite loop prevents the pod from exiting/crashing
        while(true) {
            try {
                Thread.sleep(10000); 
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public String getStatus(int days) {
        return (days > 10) ? "Pending Approval" : "Auto-Approved";
    }
}
