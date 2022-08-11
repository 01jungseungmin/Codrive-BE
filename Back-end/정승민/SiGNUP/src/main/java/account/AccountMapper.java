import org.apache.ibatis.annotations.Mapper;

import java.account.Account;

@Mapper
public interface AccountMapper {
	Account getAccountById(String id);
	void insertAccount(Account account);
}
