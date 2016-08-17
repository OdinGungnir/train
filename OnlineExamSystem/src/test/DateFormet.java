package test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.ol.util.DateUtil;

public class DateFormet {

	@Test
	public void test() throws Exception {
		String day="2016-08-27";
		Date nextDay=DateUtil.fomatDate(day);
		long l = DateUtil.getDaySub(DateUtil.getDay(), day);
		if(l<0)
			return;
		else if(l>=0 && l<=14){
			if(l==0)
				System.out.println("今天");
			if(l==1)
				System.out.println("明天");
			if(l==2)
				System.out.println("后天");
			if(l>2){
				int today=DateUtil.dayForWeek(DateUtil.getDay());
				int next=DateUtil.dayForWeek(day);
				if(next-today>0){
					SimpleDateFormat sdf1 = new SimpleDateFormat("E");
					String dateStr = sdf1.format(nextDay);
					System.out.println(dateStr);
				}else{
					SimpleDateFormat sdf1 = new SimpleDateFormat("E");
					String dateStr = sdf1.format(nextDay);
					System.out.println("下"+dateStr);
				}
			}
		}
		
	}
	@Test
	public void dateTest() throws Exception{
//		SimpleDateFormat sdf = new SimpleDateFormat("F-W-E");
//		System.out.println(sdf.format(DateUtil.fomatDate("2016-08-14")));
//		System.out.println(DateUtil.dayForWeek("2016-08-14"));
//		System.out.println(DateUtil.dayForWeekTips("2016-08-13"));
		String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long("1471190400000");
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        System.out.println(res);
	}

}
