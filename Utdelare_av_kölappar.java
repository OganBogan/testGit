package QueueTicketV2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utdelare_av_kölappar {
    // hämta referensen till objektet med getInstance()
    // och hämta nummret med getNextNumber()

    public static void main(String[] args) {
        QueueTicketDispenser ticketDisp = QueueTicketDispenser.getInstance();
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n;
        
        System.out.println("Skriv in hur många kölappar du vill skriva ut.");
        while (true) {
            try {
                n = Integer.parseInt(stdin.readLine());
                break;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
        
        System.out.println("Skriver ut kölappar...");
        for (int i = 0; i < n; i++) {
            System.out.println("Kölapp: " + ticketDisp.getNextNumber());
        }
        
        System.exit(0);
    }
}