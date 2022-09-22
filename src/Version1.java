import java.util.Scanner;

public class Version1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Initial Version");
        int major, minor, patch;
        String input = sc.nextLine();
        System.out.println(input);
        String[] inputArray = new String[4];
        int index = 0;
        for (String s : input.split(".")) {
            inputArray[index] = s;
            index++;
        }
        if (inputArray[0] != null)
            major = Integer.parseInt((inputArray[0]));
        else major = -1;
        if (inputArray[1] != null)
            minor = Integer.parseInt((inputArray[1]));
        else minor = -1;
        if (inputArray[2] != null)
            patch = Integer.parseInt((inputArray[2]));
        else patch = -1;
        System.out.println("enter commands");
        VersionsEx ver = new VersionsEx(major, minor, patch);
        while (sc.hasNext()) {
            String command = sc.nextLine();
            switch (command) {
                case "major":
                    ver.major();
                    break;
                case "minor":
                    ver.minor();
                    break;
                case "patch":
                    ver.patch();
                    break;
                case "rollback":
                    ver.rollback();
                    break;
                case "release":
                    ver.release();
                    break;
            }
        }


    }
}
