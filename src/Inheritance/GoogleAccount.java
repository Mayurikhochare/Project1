package Inheritance;

public class GoogleAccount implements GoogleDrive,GoogleMeet{
    @Override
    public void uploadDocuments() {
        System.out.println("Upload documents to drive");
    }

    @Override
    public void conductMeeting() {
        System.out.println("Conduct meeting using meet");

    }
}
