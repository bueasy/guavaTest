import com.google.common.base.Optional;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.graph.Graph;


/**
 * Created by bueasy on 16-11-7.
 */
public class Test {
    public static void main(String[] args) {


        Optional<Integer> possible = Optional.fromNullable(null);

        boolean flag=possible.isPresent(); // returns true
        if(flag){
            int t = possible.get(); // returns 5
            System.out.println("flag="+flag+",t="+t);
        }else{

            System.out.println("flag="+flag);
        }



    }
}
