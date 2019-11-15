package practiceTests;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import mergedMeetingProblem.Meeting;
import mergedMeetingProblem.MergeMeetings;

public class MergeMeetingsTest {
	
	@Test
	public void mergeMeetingRangeTest_1() {
		
		ArrayList<Meeting> meetingTimes= new ArrayList<Meeting>();
		meetingTimes.add(new Meeting(0, 1));
		meetingTimes.add(new Meeting(3, 5));
		meetingTimes.add(new Meeting(4, 8));
		meetingTimes.add(new Meeting(10, 12));
		meetingTimes.add(new Meeting(9, 10));
		
		ArrayList<Meeting> expectedMergedMeetings= new ArrayList<Meeting>();
		expectedMergedMeetings.add(new Meeting(0, 1));
		expectedMergedMeetings.add(new Meeting(3, 8));
		expectedMergedMeetings.add(new Meeting(9, 12));
		MergeMeetings m=new MergeMeetings();
		List<Meeting> mergedMeetings=m.mergeRanges(meetingTimes);
		
		for(Meeting meeting: mergedMeetings ) {
			System.out.println(meeting.toString());
		}
		
		Assert.assertEquals(mergedMeetings, expectedMergedMeetings);
	}
	
	@Test
	public void mergeMeetingRangeTest_2() {
		
		ArrayList<Meeting> meetingTimes= new ArrayList<Meeting>();
		meetingTimes.add(new Meeting(0, 1));
		meetingTimes.add(new Meeting(1, 3));
		meetingTimes.add(new Meeting(4, 5));
		meetingTimes.add(new Meeting(6, 8));
		meetingTimes.add(new Meeting(10, 11));
		meetingTimes.add(new Meeting(7, 9));
		meetingTimes.add(new Meeting(10, 12));
		
		ArrayList<Meeting> expectedMergedMeetings= new ArrayList<Meeting>();
		expectedMergedMeetings.add(new Meeting(0, 3));
		expectedMergedMeetings.add(new Meeting(4, 5));
		expectedMergedMeetings.add(new Meeting(6, 9));
		expectedMergedMeetings.add(new Meeting(10, 12));
		MergeMeetings m=new MergeMeetings();
		List<Meeting> mergedMeetings=m.mergeRanges(meetingTimes);
		
		for(Meeting meeting: mergedMeetings ) {
			System.out.println(meeting.toString());
		}
		
		Assert.assertEquals(mergedMeetings, expectedMergedMeetings);
	}
	
	@Test(expectedExceptions= {IllegalArgumentException.class})
	public void mergeMeetingRangeNegativeTest_1() {
		
		ArrayList<Meeting> meetingTimes= new ArrayList<Meeting>();
		
		MergeMeetings m=new MergeMeetings();
		List<Meeting> mergedMeetings=m.mergeRanges(meetingTimes);
	}

}
