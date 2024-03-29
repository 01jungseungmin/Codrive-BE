import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.mapper.AccountMapper;
import com.java.AccountService;
import com.java.Account;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountMapper accountMapper;
	
	@Override
	public void join(Account account) {
		accountMapper.insertAccount(account);
	}
	
}
