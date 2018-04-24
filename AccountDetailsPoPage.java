package eucr.pages;

import static com.pages.SeleniumDriver.getDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import clima.start.ProjectDataVariables;
import com.utils.ax;
import eucr.pages.api.Eucr;
import eucr.pages.data.GlobalInputData;



/**
 * Page object representing AccountDetailsPoPage page.
 *
 * @author kgumulak
 */
public class AccountDetailsPoPage extends AbstractPage<AccountDetailsPoPage> {

	public static AccountDetailsPoPage runEucr;
	
	@FindBy(how=How.XPATH, using="//li/a[@href='#mainForm:accountMainTab']")
	WebElement accountsDetailsTabMain;	
	@FindBy(id="mainForm:accountMainTab")
	WebElement accountsDetailsMainCartBody;	
	
	@FindBy(how=How.XPATH, using="//li/a[@href='#mainForm:holdingsTab']")
	WebElement accountsDetailsTabHoldings;	
	@FindBy(id="mainForm:holdingsTab")
	WebElement accountsDetailsHoldingsCartBody;	

	@FindBy(how=How.XPATH, using="//li/a[@href='#mainForm:authorizedRepresentativesTab']")
	WebElement accountsDetailsTabArs;	
	@FindBy(id="mainForm:authorizedRepresentativesTab")
	WebElement accountsDetailsArsCartBody;	

	@FindBy(how=How.XPATH, using="//li/a[@href='#mainForm:additionalAuthorizedRepresentativesTab']")
	WebElement accountsDetailsTabAArs;	
	@FindBy(id="mainForm:additionalAuthorizedRepresentativesTab")
	WebElement accountsDetailsAArsCartBody;	

	@FindBy(how=How.XPATH, using="//li/a[@href='#mainForm:installationTab']")
	WebElement accountsDetailsTabInstallation;
	@FindBy(id="mainForm:installationTab")
	WebElement accountsDetailsInstallCartBody;	

	@FindBy(how=How.XPATH, using="//li/a[@href='#mainForm:aircraftOperatorTab']")
	WebElement accountsDetailsTabAirOps;	
	@FindBy(id="mainForm:aircraftOperatorTab")
	WebElement accountsDetailsAirOpsCartBody;	

	@FindBy(how=How.XPATH, using="//li/a[@href='#mainForm:contactPersonTab']")
	WebElement accountsDetailsTabContactPerson;	
	@FindBy(id="mainForm:contactPersonTab")
	WebElement accountsDetailsContactPersonCartBody;	

	@FindBy(how=How.XPATH, using="//li/a[@href='#mainForm:complianceTab']")
	WebElement accountsDetailsTabCompliance;	
	@FindBy(id="mainForm:complianceTab")
	WebElement accountsDetailsComplianceCartBody;	
	
	@FindBy(how=How.XPATH, using="//li/a[@href='#mainForm:verifierTab']")
	WebElement accountsDetailsTabVerifier;	
	@FindBy(id="mainForm:verifierTab")
	WebElement accountsDetailsVerifierCartBody;	
	
	@FindBy(how=How.XPATH, using="//li/a[@href='#mainForm:trustedAccountsTab']")
	WebElement accountsDetailsTabTrustedAccList;	
	@FindBy(id="mainForm:trustedAccountsTab")
	WebElement accountsDetailsTalCartBody;	
	
	@FindBy(how=How.XPATH, using="//li/a[@href='#mainForm:accountStatementsTab']")
	WebElement accountsDetailsTabAccStatements;	
	@FindBy(id="mainForm:accountStatementsTab")
	WebElement accountsDetailsAccStatCartBody;	
	
	// #####################################################################################
	//	Holding Account
	
	@FindBy(id="mainForm:buttonTransactionProposal")
	WebElement detailsProposeTransaction;	
	
	@FindBy(how=How.XPATH, using="//a[contains(@onclick,'SURRENDER_ALLOWANCE')]")
	WebElement detailsProposeSurrender;	
	
	// #####################################################################################
	@FindBy(how=How.XPATH, using="//div[contains(concat(' ',@class,' '),'ui-panel')]/div/span[contains(normalize-space(),'Transaction selection')]/../..//div[contains(concat(' ',,' '),'ui-panel-content')]")
	WebElement detailsTransactionSelectionPanel;
	
	@FindBy(how=How.XPATH, using="//a[contains(@onclick,'TRANSFER_ALLOWANCE')]")
	WebElement trxSelectTransferOfAllowances;
	
	@FindBy(how=How.XPATH, using="//a[contains(@onclick,'TRANSFER_KYOTO_UNITS')]")
	WebElement trxSelectTransferOfKpUnits;
	
	@FindBy(how=How.XPATH, using="//a[contains(@onclick,'DELETE_ALLOWANCE')]")
	WebElement trxSelectDeletionOfAllowances;

	@FindBy(how=How.XPATH, using="//a[contains(@onclick,'VOLUNTARY_CANCELLATION_KYOTO_UNITS')]")
	WebElement trxSelectVoluntaryCancellationsKpUnits;
	
	@FindBy(how=How.XPATH, using="//a[contains(@onclick,'MANDATORY_CANCELLATION')]")
	WebElement trxSelectMandatoryCancellationsKpUnits;

	@FindBy(how=How.XPATH, using="//a[contains(@onclick,'ARTICLE_3_POINT_7TER_CANCELLATION')]")
	WebElement trxSelectArt37CancellationsKpUnits;
	
	@FindBy(how=How.XPATH, using="//a[contains(@onclick,'AMBITION_INCREASE_CANCELLATION')]")
	WebElement trxSelectAmbitionIncreaseCancellationsKpUnits;
	
	@FindBy(how=How.XPATH, using="//a[contains(@onclick,'CANCELLATION_AGAINST_DELETION')]")
	WebElement trxSelectCancelOfKpAgainsDeletionOfGa;
	// ###################################################################################
	@FindBy(id="mainForm:acquiringAccountPartialId")
	WebElement trxAllwcAccNumberIdentifier;

	@FindBy(id="mainForm:acquiringAccountCheckDigits")
	WebElement trxAllwcAccNumberCheckDigit;
	
	@FindBy(id="mainForm:comment")
	WebElement trxAllwcTransactionComment;
	
	@FindBy(id="mainForm:holdingsTable:0:transferQuantityInput")
	WebElement trxAllwcAviationInputQuantTotransfer;
	
	@FindBy(id="mainForm:holdingsTable:1:transferQuantityInput")
	WebElement trxAllwcGeneralInputQuantTotransfer;

	@FindBy(id="mainForm:buttonDialogOpener")
	WebElement trxAllwcNextButton;

	
	@FindBy(how=How.XPATH, using="//input[@type='text' and contains(@name,'surrenderAllowancesMainForm')]")
	WebElement trxAllwcSurrenderInputQuantTotransfer;

	@FindBy(id="surrenderAllowancesMainForm:comment")
	WebElement trxAllwcSurrenderCommentsField;

	@FindBy(id="surrenderAllowancesMainForm:buttonSubmit")
	WebElement trxSurrenderSubmitButton;
	
	
	@FindBy(how=How.XPATH, using="//div[contains(concat(' ',@class,' '),'ui-dialog')]/div[contains(concat(' ',@class,' '),'ui-dialog-titlebar')]/span[contains(normalize-space(),'Transfer Confirmation')]/../..")
	WebElement popupTransferConfirmationBox;

	@FindBy(how=How.XPATH, using="//div[@id='confirmTransferDialogue']//button[contains(normalize-space(),'Confirm')]")
	WebElement popupTransferConfirmButton;
	
	@FindBy(how=How.XPATH, using="//div[contains(concat(' ',@class,' '),'ui-messages-info')]") 
	WebElement greenBoxTransactionSuccessMonit;
	
	@FindBy(how=How.XPATH, using="//div[contains(concat(' ',@class,' '),'ui-dialog')]/div[contains(concat(' ',@class,' '),'ui-dialog-titlebar')]/span[contains(normalize-space(),'Surrender Confirmation')]/../..")
	WebElement popupTransferSurrenderBox;

	@FindBy(how=How.XPATH, using="//form[@id='confirmSurrenderDialogForm']//button[contains(@id,'confirmSurrenderDialogForm:')]")
	WebElement popupSurrenderConfirmButton;

	
	@FindBy(id="mainForm:buttonAddAauthorizedRepresentative")
	WebElement addArButton;	
	@FindBy(id="mainForm:buttonAddAARepresentative")
	WebElement addAArButton;
	
	// ##[ UPDATE installation/airops button ]#################################################################################
	@FindBy(id="mainForm:buttonUpdateInstallation")
	WebElement updateInstallationButton;

	
	@FindBy(id="mainForm:buttonUpdateAircraftOperator")
	WebElement buttonUpdateAircraftOperator;
	
	
	// ###[ ACCOUNT DETAILS ]################################################################################
	@FindBy(id="mainForm:suspendAccountButton")
	WebElement suspendAccountButton;
	@FindBy(id="mainForm:restoreAccountButton")
	WebElement restoreAccountButton;
	
	@FindBy(id="mainForm:delegateButton")
	WebElement delegateAccountButton;
	
	@FindBy(id="mainForm:closeAccountButton")
	WebElement closeAccountButton;
	
	@FindBy(id="mainForm:unblockButton")
	WebElement unblockAccountButton;
	@FindBy(id="mainForm:blockButton")
	WebElement blockAccountButton;
	
	@FindBy(how=How.XPATH, using="//div[contains(concat(' ',@class,' '),'ui-dialog')]//span[contains(normalize-space(),'Confirm unblocking of account')]")
	WebElement unblockAccountPopUp;
	@FindBy(how=How.XPATH, using="//div[contains(concat(' ',@class,' '),'ui-dialog')]//span[contains(normalize-space(),'Confirm unblocking of account')]/../..//button/span[contains(normalize-space(),'Confirm')]")
	WebElement unblockAccountPopUpConfirmButton;
	
	@FindBy(how=How.XPATH, using="//div[contains(concat(' ',@class,' '),'ui-dialog')]//span[contains(normalize-space(),'Confirm blocking of account')]")
	WebElement blockAccountPopUp;
	@FindBy(how=How.XPATH, using="//div[contains(concat(' ',@class,' '),'ui-dialog')]//span[contains(normalize-space(),'Confirm blocking of account')]/../..//button/span[contains(normalize-space(),'Confirm')]")
	WebElement blockAccountPopUpConfirmButton;
	
	
	@FindBy(id="mainForm:buttonChangeAccountGroup")
	WebElement changeAccountGroupButton;
	@FindBy(id="mainForm:buttonUpdateNaturalPersonAccountHolder")
	WebElement updateAccountHolderButton;
	
	@FindBy(id="mainForm:buttonUpdateContactPerson")
	WebElement updateContactPersonInformationButton;
	
	@FindBy(id="mainForm:buttonSubmit")
	WebElement submitAccountHolderUpdateButton;
	
	@FindBy(id="mainForm:buttonRemove")
	WebElement removeArButton;
	
	@FindBy(how=How.XPATH, using="//span[contains(concat(' ',@class,' '),'ui-messages-info-summary') and contains(normalize-space(),'has been submitted under identifier')]") 
	WebElement greenBoxRemovalArMonit;

	@FindBy(id="mainForm:unreleaseAccountButton")
	WebElement unreleaseAccountButton;

	
	
	@FindBy(how=How.XPATH, using="//div[contains(concat(' ',@class,' '),'ui-panel')]//span[@class='ui-panel-title' and contains(normalize-space(),'Account Unrelease')]/../..//button[@id='mainForm:buttonSubmit']")
	WebElement unreleaseAccountSubmitButton;
	
	// ###[ COMPLIANCE TESB OF ACCOUNT DETAILS ]################################################################################
	
	@FindBy(id="mainForm:buttonSave") 
	WebElement saveButton;
	@FindBy(id="mainForm:refreshButton") 
	WebElement refreshButton;
	
	
	@FindBy(how=How.XPATH, using="//span[contains(@class,'ui-messages-warn-summary') and contains(normalize-space(),'Compliance data are being recalculated')]") 
	WebElement complianceDataRecalculationWarning;
	
	@FindBy(how=How.XPATH, using="//div[@id='mainForm:complianceTab']/table[@class='ui-datatable']/tbody/tr[position()=1]/td[position()=4]") //    contains(@class,'ui-messages-warn-summary') and contains(normalize-space(),'Compliance data are being recalculated')] 
	WebElement statusOfAccountCellOnComplianceTab;
	
	
	
	@FindBy(how=How.XPATH, using="//fieldset//legend[contains(normalize-space(),'Verified Emissions')]/..//tbody[@class='ui-datatable-data']//tr[position()=1]/td[position()=2]//a") 
	WebElement emissionLinkProposeFor2013;
	@FindBy(how=How.XPATH, using="//fieldset//legend[contains(normalize-space(),'Verified Emissions')]/..//tbody[@class='ui-datatable-data']//tr[position()=2]/td[position()=2]//a") 
	WebElement emissionLinkProposeFor2014;
	@FindBy(how=How.XPATH, using="//fieldset//legend[contains(normalize-space(),'Verified Emissions')]/..//tbody[@class='ui-datatable-data']//tr[position()=3]/td[position()=2]//a") 
	WebElement emissionLinkProposeFor2015;
	@FindBy(how=How.XPATH, using="//fieldset//legend[contains(normalize-space(),'Verified Emissions')]/..//tbody[@class='ui-datatable-data']//tr[position()=4]/td[position()=2]//a") 
	WebElement emissionLinkProposeFor2016;
	@FindBy(how=How.XPATH, using="//fieldset//legend[contains(normalize-space(),'Verified Emissions')]/..//tbody[@class='ui-datatable-data']//tr[position()=5]/td[position()=2]//a") 
	WebElement emissionLinkProposeFor2017;
	@FindBy(how=How.XPATH, using="//fieldset//legend[contains(normalize-space(),'Verified Emissions')]/..//tbody[@class='ui-datatable-data']//tr[position()=6]/td[position()=2]//a") 
	WebElement emissionLinkProposeFor2018;
	@FindBy(how=How.XPATH, using="//fieldset//legend[contains(normalize-space(),'Verified Emissions')]/..//tbody[@class='ui-datatable-data']//tr[position()=7]/td[position()=2]//a")
	WebElement emissionLinkProposeFor2019;
	@FindBy(how=How.XPATH, using="//fieldset//legend[contains(normalize-space(),'Verified Emissions')]/..//tbody[@class='ui-datatable-data']//tr[position()=8]/td[position()=2]//a") 
	WebElement emissionLinkProposeFor2020;
	// Exclusion Checkboxes
	@FindBy(how=How.XPATH, using="//input[@type='checkbox' and contains(@id,'0:allDay')]") 
	WebElement exclusionCheckbox2013;
	@FindBy(how=How.XPATH, using="//input[@type='checkbox' and contains(@id,'1:allDay')]") 
	WebElement exclusionCheckbox2014;
	@FindBy(how=How.XPATH, using="//input[@type='checkbox' and contains(@id,'2:allDay')]") 
	WebElement exclusionCheckbox2015;
	@FindBy(how=How.XPATH, using="//input[@type='checkbox' and contains(@id,'3:allDay')]") 
	WebElement exclusionCheckbox2016;
	@FindBy(how=How.XPATH, using="//input[@type='checkbox' and contains(@id,'4:allDay')]") 
	WebElement exclusionCheckbox2017;
	@FindBy(how=How.XPATH, using="//input[@type='checkbox' and contains(@id,'5:allDay')]") 
	WebElement exclusionCheckbox2018;
	@FindBy(how=How.XPATH, using="//input[@type='checkbox' and contains(@id,'6:allDay')]") 
	WebElement exclusionCheckbox2019;
	@FindBy(how=How.XPATH, using="//input[@type='checkbox' and contains(@id,'7:allDay')]") 
	WebElement exclusionCheckbox2020;
	// ###################################################################################
	@FindBy(how=How.XPATH, using="//fieldset//legend[contains(normalize-space(),'Compliance')]/..//tbody/tr[position()=1]/td[contains(normalize-space(),'Dynamic Compliance Status')]/following-sibling::td")  
	WebElement complianceDcsCell;
	
	@FindBy(how=How.XPATH, using="//div[@id='mainForm:complianceTab']/table/tbody[@class='ui-datatable-data']/tr/td[position()=5]") 
	WebElement accountTypeLabelOnAccountDetailView;
	// ###################################################################################
	@Override
	protected ExpectedCondition<?> getPageLoadCondition() {
		return ExpectedConditions.titleContains("Account Main Details");
	}
	@Override
	public ExpectedCondition<?> getPageLoadCondition(String titlePart) {
		return ExpectedConditions.titleContains(titlePart);
	}

	@Override
	public String getPageUrl() {
		return "";
	}

	public AccountDetailsPoPage openTab(AccountDetailsPoPage pages, String tabShort /*[MAIN,HOLD,ARS,AARS,AIR.INST,CONT,COMPL,VER,TALS,STATS]*/){
		switch (tabShort) {
		case "MAIN":
			pages.accountsDetailsTabMain.click();
			ax.wait4element(getDriver(), accountsDetailsMainCartBody);
			return pages;
		case "HOLD":
			pages.accountsDetailsTabHoldings.click();
			ax.wait4element(getDriver(), accountsDetailsHoldingsCartBody);
			return pages;
		case "ARS":
			pages.accountsDetailsTabArs.click();
			ax.wait4element(getDriver(), accountsDetailsArsCartBody);
			return pages;
		case "AARS":
			pages.accountsDetailsTabAArs.click();
			ax.wait4element(getDriver(), accountsDetailsAArsCartBody);
			return pages;
		case "INST":
			pages.accountsDetailsTabInstallation.click();
			ax.wait4element(getDriver(), accountsDetailsInstallCartBody);
			return pages;
		case "AIR":
			pages.accountsDetailsTabAirOps.click();
			ax.wait4element(getDriver(), accountsDetailsAirOpsCartBody);
			return pages;
		case "COMPL":
			pages.accountsDetailsTabCompliance.click();
			ax.wait4element(getDriver(), accountsDetailsComplianceCartBody);
			return pages;
		case "CONT":
			pages.accountsDetailsTabContactPerson.click();
			ax.wait4element(getDriver(), accountsDetailsContactPersonCartBody);
			return pages;
		case "VER":
			pages.accountsDetailsTabVerifier.click();
			ax.wait4element(getDriver(), accountsDetailsVerifierCartBody);
			return pages;
		case "TALS":
			pages.accountsDetailsTabTrustedAccList.click();
			ax.wait4element(getDriver(), accountsDetailsTalCartBody);
			return pages;
		case "STATS":
			pages.accountsDetailsTabAccStatements.click();
			ax.wait4element(getDriver(), accountsDetailsAccStatCartBody);
			return pages;
		}
		return null;
	}
	
	public AccountDetailsPoPage provideAccountDetailForTranferOfAllowances(String acquiredAccountType, String fullAccountString, String value){
		trxAllwcAccNumberIdentifier.sendKeys(fullAccountString.split("-")[2]);
		trxAllwcAccNumberCheckDigit.sendKeys(fullAccountString.split("-")[4]);
		trxAllwcTransactionComment.sendKeys("Transfer into " + fullAccountString);
			if(value.contains(":")){
				if(acquiredAccountType.equals("OHA")){
					trxAllwcGeneralInputQuantTotransfer.sendKeys(value.split(":")[0]);	
				}
				if(acquiredAccountType.equals("AOHA")){
					trxAllwcAviationInputQuantTotransfer.sendKeys(value.split(":")[1]);	
				}
			}else{
				if(acquiredAccountType.equals("OHA")){
					trxAllwcGeneralInputQuantTotransfer.sendKeys(value);	
				}
				if(acquiredAccountType.equals("AOHA")){
					trxAllwcAviationInputQuantTotransfer.sendKeys(value);	
				}
			}
		trxAllwcNextButton.click();
		return new AccountDetailsPoPage().loadPageWithExpectedTitle(AccountDetailsPoPage.class, "Transfer");
	}
	public AccountDetailsPoPage provideDataForAccountHolderUpdate(){
		submitAccountHolderUpdateButton.click();
		return new AccountDetailsPoPage().loadPageWithExpectedTitle(AccountDetailsPoPage.class, "Account Holder Update");
	}	
	public AccountDetailsPoPage provideValueForSurrender(String value){
		trxAllwcSurrenderInputQuantTotransfer.sendKeys(value);
		trxAllwcSurrenderCommentsField.sendKeys("Surrender of allowances with value: " + value);
		trxSurrenderSubmitButton.click();
		return new AccountDetailsPoPage().loadPageWithExpectedTitle(AccountDetailsPoPage.class, "Surrender of allowances");
	}
	
	public AccountDetailsPoPage confirmOnTransferConfirmation(){
		if(ax.wait4element(getDriver(), popupTransferConfirmationBox)!=null){
			popupTransferConfirmButton.click();
			return new AccountDetailsPoPage().loadPageWithExpectedTitle(AccountDetailsPoPage.class, "Transfer");
		}
		ax.log(getDriver(), "Problem with displaying popup confirmation box for transaction");
		return null;
	}

	public AccountDetailsPoPage confirmOnSurrenderConfirmation(){
		if(ax.wait4element(getDriver(), popupTransferSurrenderBox)!=null){
			popupSurrenderConfirmButton.click();
			if(!ax.is_ERROR_DISPLAYED(getDriver())){
				return new AccountDetailsPoPage().loadPageWithExpectedTitle(AccountDetailsPoPage.class, "Account Main Details");	
			}
		}
		ax.log(getDriver(), "Problem with displaying popup confirmation box for surrender");
		return null;
	}
	
	public ArrayList<String> getTransactionRequestAndTransactionNumbers(){
		ArrayList<String> REXB = new ArrayList<String>();
		if(ax.wait4element(getDriver(), greenBoxTransactionSuccessMonit)!=null){
			String outText = greenBoxTransactionSuccessMonit.getText().trim();
			REXB.add(ax.GET_WORD_AFTER_TEXT(outText, "request with id"));
			REXB.add(ax.GET_WORD_AFTER_TEXT(outText, "identifier"));
			ax.log("Request Number: " + REXB.get(0));
			ax.log("Transaction Identifier: " + REXB.get(1));
			return REXB;
		}
		ax.log(getDriver(), "Problem with displaying green box with request/trasaction numbers");
		return null;
	}
	
	public AccountDetailsPoPage clickProposeTransactionButton(){
		detailsProposeTransaction.click();
		return new AccountDetailsPoPage().loadPageWithExpectedTitle(AccountDetailsPoPage.class, "Transaction Selection");
	}
	public AccountDetailsPoPage clickProposeSurrenderLink(){
		detailsProposeSurrender.click();
		return new AccountDetailsPoPage().loadPageWithExpectedTitle(AccountDetailsPoPage.class, "Surrender of allowances");
	}
	
	public AccountDetailsPoPage clickTransferOfAllowances(){
		trxSelectTransferOfAllowances.click();
		return new AccountDetailsPoPage().loadPageWithExpectedTitle(AccountDetailsPoPage.class, "Transfer");
	}
	public AccountDetailsPoPage clickTransferOfKpUnits(){
		trxSelectTransferOfKpUnits.click();
		return new AccountDetailsPoPage().loadPageWithExpectedTitle(AccountDetailsPoPage.class, "Transfer");
	}
	public AccountDetailsPoPage goToAccountsPage() {
		return new AccountDetailsPoPage().loadPageWithUrl(AccountDetailsPoPage.class);
	}
	public AccountDetailsPoPage open() {
		return new AccountDetailsPoPage().loadPage(AccountDetailsPoPage.class);
	}
	@Override
	public String getExpectedPageTitle() {
		return "Account Main Details";
	}
	
	public AccountSuspendPage clickSuspendAccountButton(){
		updateInstallationButton.click();
		return new AccountSuspendPage().loadPageWithExpectedTitle(AccountSuspendPage.class, "Account Suspend");
	}
	public AccountDetailsPoPage clickUnreleaseAccountButton(){
		unreleaseAccountButton.click();
		AccountDetailsPoPage unrelease = new AccountDetailsPoPage().loadPageWithExpectedTitle(AccountDetailsPoPage.class, "Account Unrelease");
		ax.wait4element(getDriver(), unreleaseAccountSubmitButton);
		if(unreleaseAccountSubmitButton.isDisplayed()){
			unreleaseAccountSubmitButton.click();
			return new AccountDetailsPoPage().loadPageWithExpectedTitle(AccountDetailsPoPage.class, "Account Unrelease");
		}else{
			return (AccountDetailsPoPage)ax.returnWhenNull(getDriver(), "Problem with unreleasing");
		}
	}
	
	public AccountClosurePoPage clickCloseAccountButton(){
		closeAccountButton.click();
		return new AccountClosurePoPage().loadPageWithExpectedTitle(AccountClosurePoPage.class, "Account Closure");
	}
	public AccountDetailsPoPage clickUnblockAccountButtonAndConfirm(String accountIdentifier){
		try {
			unblockAccountButton.click();
			if(ax.wait4element(getDriver(), unblockAccountPopUp)!=null &&  ax.wait4element(getDriver(), unblockAccountPopUpConfirmButton)!=null){
				ax._clickMe(getDriver(), unblockAccountPopUpConfirmButton);
				return new AccountDetailsPoPage().loadPageWithExpectedTitle(AccountDetailsPoPage.class, "Account Main Details");
			}else{
				ax.log("Problem with confirm popup for unblocking account "+accountIdentifier);
				return null;
			}
		} catch (Exception e) {
			ax.log("Problem with clicking and unblocking account "+accountIdentifier);
			return null;
		}
		
	}
	public AccountDetailsPoPage clickBlockAccountButtonAndConfirm(String accountIdentifier){
		try {
			blockAccountButton.click();
			if(ax.wait4element(getDriver(), blockAccountPopUp)!=null &&  ax.wait4element(getDriver(), blockAccountPopUpConfirmButton)!=null){
				ax._clickMe(getDriver(), blockAccountPopUpConfirmButton);
				return new AccountDetailsPoPage().loadPageWithExpectedTitle(AccountDetailsPoPage.class, "Account Main Details");
			}else{
				ax.log("Problem with confirm popup for blocking account "+accountIdentifier);
				return null;
			}
		} catch (Exception e) {
			ax.log("Problem with clicking and blocking account "+accountIdentifier);
			return null;
		}
		
	}		
	public AccountAuthoriseRepresentativePoPage clickAdArButton(){
		addArButton.click();
		return new AccountAuthoriseRepresentativePoPage().loadPageWithExpectedTitle(AccountAuthoriseRepresentativePoPage.class, "Account Representative Addition");
	}	
	public AccountAuthoriseRepresentativePoPage clickAdAarButton(){
		addAArButton.click();
		return new AccountAuthoriseRepresentativePoPage().loadPageWithExpectedTitle(AccountAuthoriseRepresentativePoPage.class, "Account Representative Addition");
	}	
	
	public InstallationUpdatePoPage clickUpdateInstallationButton(){
		updateInstallationButton.click();
		return new InstallationUpdatePoPage().loadPageWithExpectedTitle(InstallationUpdatePoPage.class, "Installation Update");
	}
	public AirOpsUpdatePoPage clickUpdateAirOpsButton(){
		buttonUpdateAircraftOperator.click();
		return new AirOpsUpdatePoPage().loadPageWithExpectedTitle(AirOpsUpdatePoPage.class, "Aircraft Operator Update");
	}
	
	public String accountTypeByAccountDetialInfoTable(){
		String accountType = ax.getText_from_WebElement(getDriver(), accountTypeLabelOnAccountDetailView);
		if(accountType.contains("Operator holding account")) return "OHA";
		if(accountType.contains("Aircraft operator holding account")) return "AOHA";
		
		return null;
	}
	
	public AccountAuthoriseRepresentativePoPage suspendAr(WebDriver driver, String URID){
		WebElement suspendButton;
		List<WebElement> fieldsets = driver.findElements(By.xpath("//fieldset"));
		for (WebElement fieldBox : fieldsets) {
			if(fieldBox.getText().contains(URID)){
				suspendButton = driver.findElement(By.xpath("//fieldset[contains(normalize-space(),'"+URID+"')]/following-sibling::div[1]//button[contains(normalize-space(),'Suspend')]")); 
				suspendButton.click();
				return new AccountAuthoriseRepresentativePoPage().loadPageWithExpectedTitle(AccountAuthoriseRepresentativePoPage.class, "EUCR");
			}
		}
		return null;
	}
	public AccountRequestHolderInformation clickAccountHolderUpdateButton(){
		updateAccountHolderButton.click();
		return new AccountRequestHolderInformation().loadPageWithExpectedTitle(AccountRequestHolderInformation.class, "Account Holder Update");
	}	
	public AccountContactPage clickContactPerfonInformationrUpdateButton(){
		updateContactPersonInformationButton.click();
		return new AccountContactPage().loadPageWithExpectedTitle(AccountContactPage.class, "Contact Person Update");
	}	
	public AccountSuspendPage suspendAccount(){
		suspendAccountButton.click();
		return new AccountSuspendPage().loadPageWithExpectedTitle(AccountSuspendPage.class, "Account Suspend");
	}	
	public AccountSuspendPage restoreAccount(){
		restoreAccountButton.click();
		return new AccountSuspendPage().loadPageWithExpectedTitle(AccountSuspendPage.class, "Account Restore");
	}	
	
	
	public AccountAuthoriseRepresentativePoPage restoreAr(WebDriver driver, String URID){
		WebElement restoreButton;
		List<WebElement> fieldsets = driver.findElements(By.xpath("//fieldset"));
		for (WebElement fieldBox : fieldsets) {
			if(fieldBox.getText().contains(URID)){
				restoreButton = driver.findElement(By.xpath("//fieldset[contains(normalize-space(),'"+URID+"')]/following-sibling::div[1]//button[contains(normalize-space(),'Restore')]")); 
				restoreButton.click();
				return new AccountAuthoriseRepresentativePoPage().loadPageWithExpectedTitle(AccountAuthoriseRepresentativePoPage.class, "EUCR");
			}
		}
		return null;
	}

	public AccountAuthoriseRepresentativePoPage replaceAr(WebDriver driver, String URID_OLD){
		WebElement replaceButton;
		List<WebElement> fieldsets = driver.findElements(By.xpath("//fieldset"));
		for (WebElement fieldBox : fieldsets) {
			if(fieldBox.getText().contains(URID_OLD)){
				replaceButton = driver.findElement(By.xpath("//fieldset[contains(normalize-space(),'"+URID_OLD+"')]/following-sibling::div[1]//button[contains(normalize-space(),'Replace')]")); 
				replaceButton.click();
				return new AccountAuthoriseRepresentativePoPage().loadPageWithExpectedTitle(AccountAuthoriseRepresentativePoPage.class, "EUCR");
			}
		}
		return null;
	}
	public AuthorisedRepresentativeUpdatePoPage updateAr(WebDriver driver, String URID){
		WebElement suspendButton;
		List<WebElement> fieldsets = driver.findElements(By.xpath("//fieldset"));
		for (WebElement fieldBox : fieldsets) {
			if(fieldBox.getText().contains(URID)){
				suspendButton = driver.findElement(By.xpath("//fieldset[contains(normalize-space(),'"+URID+"')]/following-sibling::div[1]//button[contains(normalize-space(),'Update')]")); 
				suspendButton.click();
				return new AuthorisedRepresentativeUpdatePoPage().loadPageWithExpectedTitle(AuthorisedRepresentativeUpdatePoPage.class, "EUCR");
			}
		}
		return null;
	}	
	public String removeAr(WebDriver driver, String URID){
		WebElement removeButton;
		List<WebElement> fieldsets = driver.findElements(By.xpath("//fieldset"));
		for (WebElement fieldBox : fieldsets) {
			if(fieldBox.getText().contains(URID)){
				removeButton = driver.findElement(By.xpath("//fieldset[contains(normalize-space(),'"+URID+"')]/following-sibling::div[1]//button[contains(normalize-space(),'Remove')]")); 
				removeButton.click();
				AuthorisedRepresentativeUpdatePoPage removePage = new AuthorisedRepresentativeUpdatePoPage().loadPageWithExpectedTitle(AuthorisedRepresentativeUpdatePoPage.class, "EUCR");
				removeArButton.click();
				removePage = new AuthorisedRepresentativeUpdatePoPage().loadPageWithExpectedTitle(AuthorisedRepresentativeUpdatePoPage.class, "EUCR");
				if(ax.wait_elm(getDriver(), greenBoxRemovalArMonit)){
					return ax.GET_WORD_AFTER_TEXT(greenBoxRemovalArMonit.getText().trim(), "has been submitted under identifier");
				}else{
					return (String) ax.returnWhenNull(getDriver(), "Problem with getting green box after proposal of removing AR");
				}
			}
		}
		return null;
	}
	public String getContactPersonInformationText(WebDriver driver){
		List<WebElement> cpiPanels = driver.findElements(By.xpath("//fieldset/legend[contains(normalize-space(),'Contact Person Information')]/.."));
		if(cpiPanels.size() > 0){
			return cpiPanels.get(0).getText();
		}
		return null;
	}	
	
	public EnterEmissionPoPage clickProposeEmission(String year){
		ax.turnOff_time(getDriver());	
		try {
				switch (year) {
				case "2013": 			this.emissionLinkProposeFor2013.click(); 			break;
				case "2014": 			this.emissionLinkProposeFor2014.click(); 			break;
				case "2015": 			this.emissionLinkProposeFor2015.click(); 			break;
				case "2016": 			this.emissionLinkProposeFor2016.click(); 			break;
				case "2017": 			this.emissionLinkProposeFor2017.click(); 			break;
				case "2018": 			this.emissionLinkProposeFor2018.click(); 			break;
				case "2019": 			this.emissionLinkProposeFor2019.click(); 			break;
				case "2020": 			this.emissionLinkProposeFor2020.click(); 			break;
				}
				ax.turnOn_time(getDriver());
			return new EnterEmissionPoPage().loadPageWithExpectedTitle(EnterEmissionPoPage.class, "Emissions");
		} catch (Exception e) {
			ax.turnOn_time(getDriver());
			ax.log(getDriver(), "Problem with clicking Propose Emission for the year " + year);
			return null;
		}
	}
	
	public AccountDetailsPoPage clickExclusionCheckboxAndRefresh(boolean excludeOrUnexlude /*[true:exclude|false:unexclude]*/, String year){
		ax.turnOff_time(getDriver());	
		WebElement checkbox = null;
		try {
				switch (year) {
				case "2013": 			checkbox = this.exclusionCheckbox2013; 			break;
				case "2014": 			checkbox = this.exclusionCheckbox2014; 			break;
				case "2015": 			checkbox = this.exclusionCheckbox2015; 			break;
				case "2016": 			checkbox = this.exclusionCheckbox2016; 			break;
				case "2017": 			checkbox = this.exclusionCheckbox2017; 			break;
				case "2018": 			checkbox = this.exclusionCheckbox2018; 			break;
				case "2019": 			checkbox = this.exclusionCheckbox2019; 			break;
				case "2020": 			checkbox = this.exclusionCheckbox2020; 			break;
				}
				checkbox.click();
				ax.turnOn_time(getDriver());
				ax._clickMe(getDriver(), saveButton);	
				ax._clickMe(getDriver(), refreshButton);
				int count = 0;
				boolean warningPresented = ax.isWebElementDisplayed(getDriver(), complianceDataRecalculationWarning);
				while(warningPresented){
					ax.wait(1);
					warningPresented = ax.isWebElementDisplayed(getDriver(), complianceDataRecalculationWarning);
					count++;
					if(count > ProjectDataVariables.TEST_RETRIAL_FACTOR_30) return null;
				}
				
				count =0;
				
				
				if(excludeOrUnexlude){ // result should be excluded
					
					while(!checkbox.isSelected()){
						ax._clickMe(getDriver(), refreshButton);
						ax.wait(1);
						count++;
						if(count > ProjectDataVariables.TEST_RETRIAL_FACTOR_30) return null;
					}
					if(checkbox!=null && checkbox.isSelected()){
						return new AccountDetailsPoPage().loadPageWithExpectedTitle(AccountDetailsPoPage.class, "Account Main Details");		
					}else{
						ax.log(getDriver(), "Problem with selecting Checkbox after clicking for Excluding for the year " + year);
						return null;
					}
					
				}else{ // result should be unexcluded
					
					while(checkbox.isSelected()){
						ax._clickMe(getDriver(), refreshButton);
						ax.wait(1);
						count++;
						if(count > ProjectDataVariables.TEST_RETRIAL_FACTOR_30) return null;
					}
					if(checkbox!=null && !checkbox.isSelected()){
						return new AccountDetailsPoPage().loadPageWithExpectedTitle(AccountDetailsPoPage.class, "Account Main Details");		
					}else{
						ax.log(getDriver(), "Problem with selecting Checkbox after clicking for UnExcluding for the year " + year);
						return null;
					}
				}
				
				
		} catch (Exception e) {
			ax.turnOn_time(getDriver());
			ax.log(getDriver(), "Problem with clicking Checkbox for Excluding for the year " + year);
			return null;
		}
	}
	
	
	public boolean checkExpectedEmissionOnComplianceTab(String year, ArrayList<Integer> emissionInputValues){
		int columnNumber 	= 3;
		int rowNum 			= GlobalInputData.getEmissionRowNumberForYear(year);
		int valueOfEmission = 0;
		String xPathForEmissionCell = "//fieldset//legend[contains(normalize-space(),'Verified Emissions')]/..//tbody[@class='ui-datatable-data']//tr[position()="+rowNum+"]/td[position()="+columnNumber+"]";
		
		if(ax.IS_NULL_OR_EMPTY_ARRAY_LIST_INTEGER(emissionInputValues)){
			if(accountTypeByAccountDetialInfoTable()!=null){
				if(accountTypeByAccountDetialInfoTable().equals("OHA")) valueOfEmission = 3;
				if(accountTypeByAccountDetialInfoTable().equals("AOHA")) valueOfEmission = 2;
			}else{
				ax.reportFail("Account is not OHA nor AOHA");
				return  false;
			}
		}else{
			valueOfEmission = ax.sumAllElementsInArray(emissionInputValues);
		}
		
		try {
			if( getDriver().findElements(By.xpath(xPathForEmissionCell)).size() > 0 ){
				String v = ax.getText_from_WebElement(getDriver(), getDriver().findElement(By.xpath(xPathForEmissionCell)));
				v = v.replace("*", "");
				if(Integer.valueOf(v) == valueOfEmission) return true;
			}
		} catch (Exception e) {
			return false;
		}
		return false;
	}
	
	
	public String getDcsFromCompliance(){
		String dcs;
		if(ax.isWebElementDisplayed(getDriver(), complianceDcsCell)){
			dcs = complianceDcsCell.getText();
			return dcs;
		}
		
		return null;
	}
	
	public boolean isDisplayedAccountStatusOnComplianceTab(){
		if(statusOfAccountCellOnComplianceTab.isDisplayed()){
			return true;
		}
		return false;
	}
	public String getStatusOfAccountFromComplianceTab(){
		try{
			return ax.getText_from_WebElement(getDriver(), statusOfAccountCellOnComplianceTab);
		}catch(Exception e){
			return null;
		}
	}
	
	
}
