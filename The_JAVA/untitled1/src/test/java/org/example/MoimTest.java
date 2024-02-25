package org.example;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class MoimTest {

    @Test
    public void isFull(){
        Moim moim = new Moim();
        moim.maxNumberOfAttendees = 100;
        moim.numberOfEnrollment = 10;
        Assert.assertFalse(moim.isEnrollmentFull());

    }

}
