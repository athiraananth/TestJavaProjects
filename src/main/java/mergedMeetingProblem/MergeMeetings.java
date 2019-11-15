package mergedMeetingProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeMeetings {
	
	public List<Meeting> mergeRanges(List<Meeting> meetingTimes){
		
		if(meetingTimes.size() == 0) {
			throw new IllegalArgumentException("Input should have minimum 2 meeting times to merge the Meeting Times");
		}
		List<Meeting>sortedMeetings=sortMeetings(meetingTimes);
		List<Meeting>mergedMeetings=new ArrayList<Meeting>();
		mergedMeetings.add(sortedMeetings.get(0));
		
		for(Meeting currentMeeting: sortedMeetings) {
			
			Meeting lastMerged=mergedMeetings.get(mergedMeetings.size()-1);
			
			if(currentMeeting.getStartTime()<=lastMerged.getEndTime()) {
				lastMerged.endTime=Math.max(lastMerged.endTime,currentMeeting.endTime);
			}
			else {
				mergedMeetings.add(currentMeeting);
			}
		}
		
		return mergedMeetings;
		
	}
	
	public List<Meeting> sortMeetings(List<Meeting> meetingTimes){
		
		Comparator<Meeting> sortByStart=new Comparator<Meeting>() {

			@Override
			public int compare(Meeting m1, Meeting m2) {
				
				Integer startTime1=m1.getStartTime();
				Integer startTime2=m2.getStartTime();
				return startTime1.compareTo(startTime2);
			}
			
			
		};
		Collections.sort(meetingTimes, sortByStart);
		return meetingTimes;
		
	}

}
