package j17_JSON;

import com.google.gson.annotations.Expose;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
	@Expose(serialize = true, deserialize = true)//deserialize는 제이슨에서  User객체(Object)로 변경할때 넣을꺼냐 말거냐를 결정하는 기능
	private String username;
	@Expose(serialize = false, deserialize = false)
	private String password;
	@Expose(serialize = true, deserialize = false)
	private String name;
	@Expose(serialize = true, deserialize = true)
	private String email;
	
}
