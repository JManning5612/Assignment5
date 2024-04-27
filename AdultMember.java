package Assignment5;

import java.time.LocalDate;

public class AdultMember extends Member {
	private static int nextMembershipId = 1;
    private int membershipId;

    public AdultMember(String firstName, String lastName, LocalDate dateOfBirth, String city, String zipCode) {
        super(firstName, lastName, dateOfBirth, city, zipCode);
        this.membershipId = nextMembershipId++;
    }

    public int getMembershipId() {
        return membershipId;
    }
}

