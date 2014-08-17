package com.franciszabala.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MasterController {

//	private BankAccountService bankAccountService;
//	
//	private AccountTypeService accountTypeService;
//	
//	@Autowired
//	public void setBankAccountService(BankAccountService bankAccountService) {
//		this.bankAccountService = bankAccountService;
//	}
//	
//	@Autowired
//	public void setAccountTypeService(AccountTypeService accountTypeService) {
//		this.accountTypeService = accountTypeService;
//	}
//	
//	@RequestMapping
//	public String list(Model model) {
//		model.addAttribute("bankAccounts", bankAccountService.findAll());
//		return "bank-accounts/list";
//	}
//	
//	@RequestMapping("/create")
//	public String showCreateBankAccountForm(Model model) {
//		model.addAttribute("form", new NewBankAccountForm());
//		model.addAttribute("accountTypes", accountTypeService.findAll());
//		return "bank-accounts/create";
//	}
//	
//	@RequestMapping(value="/create",method = RequestMethod.POST)
//	public String createBankAccount(@ModelAttribute NewBankAccountForm bankAccountForm, BindingResult result) {
//		BankAccount bankAccount = new BankAccount();
//		bankAccount.setName(bankAccountForm.getName());
//		
//		List<AccountType> accountTypes = new ArrayList<AccountType>();
//		List<Long> accountTypeIds = bankAccountForm.getAccountTypeIds();
//		if (accountTypeIds !=null) {
//			for( Long id : accountTypeIds) {
//				AccountType type = accountTypeService.find(id);
//				if (type !=null) {
//					accountTypes.add(type);
//				}
//			}
//		}
//		
//		bankAccount.setAccountTypes(accountTypes);
//		bankAccountService.create(bankAccount);
//	
//		return ("redirect:/bank-accounts/"); 
//			
//	}
	
	@RequestMapping("/home")
	public String showHomePage(Model model) {
		//model.addAttribute("form", new NewBankAccountForm());
		//model.addAttribute("accountTypes", accountTypeService.findAll());
		return "index";
	}
	
	@RequestMapping("/home/test")
	public String showHomePageTest(Model model) {
		//model.addAttribute("form", new NewBankAccountForm());
		//model.addAttribute("accountTypes", accountTypeService.findAll());
		return "store/index";
	}
	
}
