package QueueTicketV2;
// konstruktorn är private, ingen kan anropa den
// skapa en objektreferns till QueueTicketDispenser och låt metoden
// getInstance returnera detta enda objekt

public class QueueTicketDispenser {
    private int nr;
    
    private static QueueTicketDispenser theOne;
    
    public static QueueTicketDispenser getInstance () {
        theOne = new QueueTicketDispenser();
        return theOne;
    }
    
    private QueueTicketDispenser () {
        nr = 1;
    }
    
    public int getNextNumber () {
        return nr++;
    }
}

// Fortfarande några svagheter:
// Kölappsutdelaren initieras vare sig den används eller inte
// Information som behövs för att initiera objektet kanske inte finns
// tillgänglig när programmet startas och klassen laddas in.

//***** Förbättra koden genom att ovanstående beaktas *****