import redis.clients.jedis.Jedis;
import sun.util.resources.LocaleData;

public class test01 {
	//¸üÐÂ--2020-3-23
	//gihua修改
	public static void main(String[] args) {
		Jedis jedis=new Jedis("192.168.3.115", 6379);
		jedis.connect();
		System.out.println(jedis.keys("*"));
		
		
	}
}
