package Assignment5;

import java.time.LocalDate;

public class ChildMember extends Member 
{
	private static int nextMembershipId = 1000;
    private int membershipId;
    private AdultMember guardian;

    public ChildMember(String firstName, String lastName, LocalDate dateOfBirth, String city, String zipCode, AdultMember guardian) {
    	super(firstName, lastName, dateOfBirth, city, zipCode);
        this.membershipId = nextMembershipId++;
        this.guardian = guardian;
    }

    public int getMembershipId() {
        return membershipId;
    }

    public AdultMember getGuardian() {
        return guardian;
    }
}

