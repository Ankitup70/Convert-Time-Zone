import java.text.SimpleDateFormat;
import java.util.*;

import java.util.*;

class ConvertTimeZone {
    public static void main(String[] args) {
        {
            String format = " [ dd-MM-yyyy ]  [ HH:mm:ss aa ]";
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            Date dt = new  Date();

            String defaulTZ = TimeZone.getDefault().getID(); 
            System.out.println(defaulTZ);
            
            Calendar cal = new GregorianCalendar();
            cal.setTime(dt);

            System.out.println("Date : " +dateFormat.format(cal.getTime()));
            System.out.println("Timezone:" +cal.getTimeZone().getID());
            System.out.println("Timezone Name: " +cal.getTimeZone().getDisplayName());

            TimeZone jnbTZ = TimeZone.getTimeZone("Africa/Johannesburg");
            SimpleDateFormat jnbFormat = new SimpleDateFormat(format);
            jnbFormat.setTimeZone(jnbTZ);

            cal.setTimeZone(jnbTZ);
            
            System.out.println("After conversion");
            System.out.println("Date: " +jnbFormat.format(cal.getTime()) );
            System.out.println("TimeZone: " +cal.getTimeZone().getID());
            System.out.println("TimeZone Name: "+cal.getTimeZone().getDisplayName()  );
        }
    }

}

{
    public static void main(String[] args) {
        {
            String format = " [ dd-MM-yyyy ]  [ HH:mm:ss aa ]";
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            Date dt = new  Date();

            String defaulTZ = TimeZone.getDefault().getID(); 
            System.out.println(defaulTZ);
            
            Calendar cal = new GregorianCalendar();
            cal.setTime(dt);

            System.out.println("Date : " +dateFormat.format(cal.getTime()));
            System.out.println("Timezone:" +cal.getTimeZone().getID());
            System.out.println("Timezone Name: " +cal.getTimeZone().getDisplayName());

            TimeZone jnbTZ = TimeZone.getTimeZone("Africa/Johannesburg");
            SimpleDateFormat jnbFormat = new SimpleDateFormat(format);
            jnbFormat.setTimeZone(jnbTZ);

            cal.setTimeZone(jnbTZ);
            
            System.out.println("After conversion");
            System.out.println("Date: " +jnbFormat.format(cal.getTime()) );
            System.out.println("TimeZone: " +cal.getTimeZone().getID());
            System.out.println("TimeZone Name: "+cal.getTimeZone().getDisplayName()  );
        }
    }

}

