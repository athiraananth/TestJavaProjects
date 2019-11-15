package mergedMeetingProblem;

public class Meeting {
	
	public int startTime;
	public int endTime;
	
	
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getEndTime() {
		return endTime;
	}
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	
	
	public Meeting(int sTime , int eTime) {
		startTime=sTime;
		endTime=eTime;
	}


	@Override
	public String toString() {
		return "Meeting [startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + endTime;
		result = prime * result + startTime;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Meeting other = (Meeting) obj;
		if (endTime != other.endTime)
			return false;
		if (startTime != other.startTime)
			return false;
		return true;
	}


	
}
