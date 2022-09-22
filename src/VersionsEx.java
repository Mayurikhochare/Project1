import java.util.Scanner;

public class VersionsEx {
    private int major;
    private int minor;
    private int patch;
    protected int prevMajor;
    protected int prevMinor;
    protected int prevPatch;

    public VersionsEx(int major, int minor, int patch) {
        if (major == -1 && minor == -1 && patch == -1) {
            this.major = 0;
            this.minor = 0;
            this.patch = 1;
        } else {
            this.major = major;
            this.minor = minor;
            this.patch = patch;
        }
        prevMajor = -1;
        prevMinor = -1;
        prevPatch = -1;
    }

    void major() {
        prevMajor = major;
        prevMajor = major;
        prevPatch = patch;
        major++;
        minor = 0;
        patch = 0;
    }

    void minor() {
        prevMinor = minor;
        prevPatch = patch;
        minor++;
        patch = 0;
    }

    void patch() {
        prevPatch = patch;
        patch++;

    }

    String release() {
        return (major + "." + minor + "." + patch);
    }

    void rollback() {
        if (prevMajor == -1 && prevMinor == -1 && prevPatch == -1) {
            System.out.println("cannot Rollback");
        } else {
            if (prevMajor != -1) {
                major = prevMajor;
                prevMajor = -1;
            }
            if (prevMinor != -1) {
                minor = prevMinor;
                prevMinor = -1;
            }
            if (prevPatch != -1) {
                patch = prevPatch;
                prevPatch = -1;
            }

        }
    }
}