import java.util.*;
import java.text.SimpleDateFormat;
import java.util.stream.Collectors;

public class MovieNight {
    public static Boolean canViewAll(Collection<Movie> movies)  {
      List<Movie> newM=  movies.stream().sorted((o1, o2) -> {
      return o1.getStart().compareTo(o2.getStart());
       }).collect(Collectors.toList());
         ;
         newM.forEach(m-> System.out.println(m.getStart()));
     for(int i=1;i<newM.size();i++){
         return  !(newM.get(i-1).getEnd().after(newM.get(i).getStart()) );
     }
   return true;

    }




    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m");
//    return  !(newM.get(i-1).getEnd().after(newM.get(i).getStart()) );
        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie(sdf.parse("2015-01-01 20:00"), sdf.parse("2015-01-01 21:30")));
        movies.add(new Movie(sdf.parse("2015-01-01 23:10"), sdf.parse("2015-01-01 23:30")));
        movies.add(new Movie(sdf.parse("2015-01-01 21:31"), sdf.parse("2015-01-01 23:00")));

        System.out.println(MovieNight.canViewAll(movies));
    }
}

class Movie {
    private Date start, end;
    
    public Movie(Date start, Date end) {
        this.start = start;
        this.end = end;
    }
    
    public Date getStart() {
        return this.start;
    }
    
    public Date getEnd() {
        return this.end;
    } 
}