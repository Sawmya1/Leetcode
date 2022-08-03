class MyCalendar {
    List<int[]> cal;

    public MyCalendar() {
        cal = new ArrayList();
    }
    
    public boolean book(int start, int end) {
        for(int[] i:cal)
            if(i[0] < end && start < i[1]) //end > then pehle ka start 
                return false;
        cal.add(new int[]{start,end}); //array dimension
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */