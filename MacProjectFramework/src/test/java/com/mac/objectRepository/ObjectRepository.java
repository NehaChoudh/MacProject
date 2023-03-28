package com.mac.objectRepository;

import org.openqa.selenium.By;

public class ObjectRepository {
        
        /************  Local Host Object Properties *****************/
        
        public final By Advance_Button = By.cssSelector("#details-button");
        public final By ProceedLocalhost_Button = By.cssSelector("#proceed-link");
        
        /************  Genesys Cloud Login Page Object Properties *****************/
        
        public final By GenesysEmail_Button = By.cssSelector("#email");
        public final By GenesysPassword_Button = By.cssSelector("#password");
        public final By GenesysLogin_Button = By.cssSelector("#ember375 > form > button"); 
        
        public final By GenesysDialpad_Button = By.xpath("/html/body/div[4]/div/main/section[3]/div/div[2]/div[1]/div[1]/button[2]"); 
        public final By EnterNumber_Button = By.xpath("/html/body/div[4]/div/main/section[3]/div/div[2]/div[2]/div[2]/div[2]/div/div/input"); 
        public final By Dial_Button = By.xpath("/html/body/div[4]/div/main/section[3]/div/div[2]/div[2]/div[2]/button");
        
        public final By Dial_Button1 = By.cssSelector(".number.digit.digit-1");
        public final By Dial_Button4 = By.cssSelector(".number.digit.digit-4");
        public final By Dial_Button3 = By.cssSelector(".number.digit.digit-3");
        public final By Dial_Button8 = By.cssSelector(".number.digit.digit-8");
        public final By Dial_Button6 = By.cssSelector(".number.digit.digit-6");
        public final By Dial_Button0 = By.cssSelector("div:nth-child(2) div:nth-child(3) button:nth-child(11) span:nth-child(1) span:nth-child(2)");
        public final By Dial_Button00 = By.cssSelector("div:nth-child(2) div:nth-child(3) button:nth-child(11) span:nth-child(1) span:nth-child(2)");
        public final By Dial_Button33 = By.cssSelector(".number.digit.digit-3");
        public final By Dial_Button333 = By.cssSelector(".number.digit.digit-3");
        public final By Dial_Button66 = By.cssSelector(".number.digit.digit-6");
        public final By Dial_Button7 = By.cssSelector(".number.digit.digit-7");
        
        
        /************  Microsoft Login Page Object Properties *****************/
        
     
        public final By Name_InteractionSync = By.xpath("//*[@class='brand-text']");
        public final By MicrosoftEmail_Button = By.cssSelector("#i0116");
        public final By Next_Button = By.cssSelector("#idSIButton9");
        public final By MicrosoftPassword_Button = By.cssSelector("#i0118");
        public final By MicrosofSignIn_Button = By.xpath("//*[@id=\"idSIButton9\"]");
        public final By MicrosoftLogin_Button = By.cssSelector("//*[@id=\\\"idSIButton9\\\"]");
        public final By Staysignin_Button = By.cssSelector("//*[@id=\"idSIButton9\"]");
        
        public final By WrapUp = By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div/div/button");  
        public final By Notes = By.cssSelector("body > div.n-drawer-container > div:nth-child(2) > div.n-drawer.n-drawer--bottom-placement.n-drawer--native-scrollbar > div > div > div > div > div > div > div > div > div:nth-child(4) > div > div.n-input-wrapper > div > textarea");
        public final By Done = By.xpath("//span[normalize-space()='Done']"); 
        public final By Description = By.xpath("//textarea[@id='id-a91390a5-99bb-4d10-9eee-3a5c87f841f1-7-descriptione0dece4b-6fc8-4a8f-a065-082708572369-description.fieldControl-text-box-text']"); 
                                                      
        public final By Session_Name = By.cssSelector("#sessionContainer-session-id-1 > div > span"); 
        
        public final By New_Queue = By.cssSelector("#app > div > div.bottom > div.left > div > div:nth-child(2) > div > div:nth-child(4) > div"); 
            
        public final By Setting_Icon = By.xpath("//button[@id='personalSettingsLauncher_buttoncrm_header_global$button']");
          
        public final By Advance_Setting = By.xpath("//span[contains(text(),'Advanced Settings')]");
       // public final By Advance_Setting = By.xpath("//*[@aria-label=\"Advanced Settings\"]");
        public final By Advance_SettingDropDown = By.xpath("//*[@id=\"TabSettings\"]");
        public final By Solutions = By.xpath("//span[normalize-space()='Solutions']");
        public final By Mac = By.xpath("/html/body/div[1]/div[4]/div/div/div[1]/div[2]/div/div/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[1]/table/tbody/tr[2]/td[3]/nobr/a");
          
      
        public final By Configuration = By.xpath("//*[@id=\"nav_Configuration\"]");  
        
       public final By ClickToLogin = By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div[2]");  
//        public final By ClickToLogin = By.xpath("//*[@id=\"app\"]/div/div[1]/button/span"); 
 
            
        public final By New_Queue_Name = By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div/div[2]/div/div[3]/div/div/text()");
        
        public final By Default = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/aside[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]"); 
        
        public final By Search_Value_Dropdown = By.xpath("//*[@id=\"app\"]/div/div/div/div/div/div/div/div/div[3]/div/div/div[3]/div/div/div[1]/div[2]/div");
        
        public final By Select_phonenumber = By.xpath("//div[contains(@class,'n-base-select-option__content')][normalize-space()='Phone Number']");
        //public final By Select_phonenumber = By.cssSelector("#app > div > div > div > div > div > div > div > div > div:nth-child(3) > div > div > div.searchValue > div > div > div.n-base-selection-label > div.n-base-selection-input > div");
        
     
        public final By Entity_dropdown = By.xpath("//*[@id=\"app\"]/div/div/div/div/div/div/div/div/div[3]/div/div/div[4]/div[3]/table/tbody/tr/td[1]/div/div/div[1]/div[2]/div/div/div");
        
        public final By Select_Contact = By.xpath("//div[contains(@class,'n-base-select-option__content')][normalize-space()='Contact']");
     
        public final By Collapse_Button = By.cssSelector("#app > div > div > div > div > div > aside > div.n-layout-toggle-button > i > svg");
        
        public final By Telephone_01 = By.xpath("//div[contains(@class,'n-base-select-option__content')][normalize-space()='telephone1']");
      
        public final By Search_Field_dd = By.xpath("//*[@id=\"app\"]/div/div/div/div/div/div/div/div/div[3]/div/div/div[4]/div[3]/table/tbody/tr/td[2]/div/div/div[1]/div[2]/div/div/div/i");
        		
        public final By Default_Profile = By.cssSelector("//div[@class='n-menu-item-content n-menu-item-content--selected']//div[@role='none'][normalize-space()='Default']");
        
        public final By Profile_Default = By.xpath(" //*[@id=\"app\"]/div/div/div/div/div/aside/div[1]/div/div[1]/div[2]/div/div/div");
        
        public final By Toggle = By.cssSelector("#slider > div"); 
     
        public final By FieldMaping_Toggle = By.cssSelector("#app > div > div > div > div > div > div > div > div > div:nth-child(5) > div > div.slider > div > div"); 
      
        public final By Dashboard_Name = By.xpath("//*[@id=\"session-id-2\"]");
        public final By Save = By.xpath("//button[@class='n-button n-button--primary-type n-button--medium-type']");
        public final By New_Configuration = By.cssSelector("#app > div > div > div > n-layout-header > div > button");            
        public final By New_Configuration_Dropdown = By.xpath("/html/body/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/form/div/div[1]/div/div/div[1]");
        public final By Queue = By.xpath("/html/body/div[2]/div[2]/div/div[1]/div/div[2]/div[4]/div/div/div/div[1]/div/div/div[1]/div");  
        public final By Queue_Name = By.cssSelector("body > div.n-modal-container > div.n-modal-body-wrapper > div > div.n-scrollbar-container > div > div.n-card.n-modal > div.n-card__content > form > div:nth-child(2) > div.n-form-item-blank > div > div.n-input-wrapper > div > input"); 
        
        public final By Create_Button = By.cssSelector("body > div.n-modal-container > div.n-modal-body-wrapper > div > div.n-scrollbar-container > div > div.n-card.n-modal > div.n-card__footer > div > div > div:nth-child(2) > button"); 
        public final By CCP_Url = By.cssSelector("#app > div > div.bottom > div.right > div.n-card > div > section > div:nth-child(1) > div > div.n-form-item-blank > div"); 
        
        public final By CCP_Login_Url = By.cssSelector("#app > div > div.bottom > div.right > div.actions > div > div > button > span"); 
        
        public final By InteractionSync_Session_Name = By.cssSelector("#session-id-1 > div > span");
        
        public final By InteractionSync_Session_Name2 = By.cssSelector("#session-id-2 > div > span");
        
        public final By ToggleOff_Session_Name = By.cssSelector("//*[@id='sessionContainer-session-id-3']/div/span"); 
        
        public final By New_Session_Name = By.cssSelector("#session-id-2 > div > span");
        
        public final By Search_Session_Name = By.xpath("//span[normalize-space()='Search']");
        
        public final By Queue_Number = By.xpath("//input[@id='id-a91390a5-99bb-4d10-9eee-3a5c87f841f1-5-phonenumber4273edbd-ac1d-40d3-9fb2-095c621b552d-phonenumber.fieldControl-phone-text-input']");
      
        //public final By Basic_Queue = By.xpath("//span[normalize-space()='BasicQueue']");
        public final By Basic_Queue= By.xpath("//*[@title=\"BasicQueue\"]//div//span");
        
        public final By Add_Entity= By.xpath("//div[@class='actions']//span[@class='n-button__content'][normalize-space()='Add']");
        public final By Neww_Queue= By.xpath("//div[contains(text(),'New Queue')]");
    
        public final By Delete_Queue= By.cssSelector(".n-button.n-button--tertiary-type.n-button--medium-type");
        
        public final By Confirm_Delete_Queue= By.xpath("/html/body/div[2]/div[2]/div/div[1]/div/div[2]/div[3]/button[2]/div[1]"); 
        
        public final By Default_Queue= By.xpath("//div[@class='n-menu-item-content']//div[@role='none'][normalize-space()='Default']");
        public final By Default_Session_Button= By.xpath("//div[@class='n-base-selection-input__content']");
        public final By Search_Session= By.xpath("//div[contains(text(),'mac_searchSessionTemplate')]"); 
        
        public final By Default_Session= By.xpath("//div[contains(@class,'n-base-select-option__content')][normalize-space()='mac_defaultSessionTemplate']"); 
      
        public final By Basic_Queue_Phonenumber = By.xpath("//input[@id='id-a91390a5-99bb-4d10-9eee-3a5c87f841f1-5-phonenumber4273edbd-ac1d-40d3-9fb2-095c621b552d-phonenumber.fieldControl-phone-text-input']");
        
        //public final By Entity_Dropdown = By.cssSelector("#app > div > div > div > div > div > div > div > div > div:nth-child(3) > div > div > div.n-grid > div:nth-child(3) > table > tbody > tr:nth-child(2) > td.name > div > div > div.n-base-selection-label > div.n-base-loading.n-base-suffix > div > div > div > i > svg > path");
        public final By Entity_Dropdown = By.cssSelector("#app > div > div > div > div > div > div > div > div > div:nth-child(3) > div > div > div.n-grid > div:nth-child(3) > table > tbody > tr > td.name > div > div > div.n-base-selection-label");
        
    public final By Dropdown_Contact = By.xpath("//div[@class='n-base-select-option__content'][normalize-space()='Contact']");
 
    public final By Search_Field = By.cssSelector("#app > div > div > div > div > div > div > div > div > div:nth-child(3) > div > div > div.n-grid > div:nth-child(3) > table > tbody > tr:nth-child(2) > td.fields > div > div > div.n-base-selection-tags > div.n-base-loading.n-base-suffix > div > div > div > i > svg");
 
    public final By Telephone_1 = By.xpath("//div[@class='n-base-select-option__content'][normalize-space()='createdby']");
  
    //public final By Delete_Entity = By.xpath("//tbody/tr[2]/td[4]/div[1]/div[1]/button[1]/span[1]");
    public final By Delete_Entity = By.cssSelector("#app > div > div > div > div > div > div > div > div > div:nth-child(3) > div > div > div.n-grid > div:nth-child(3) > table > tbody > tr > td:nth-child(4) > div > div > button > span");
   
   /************  IVR Page Object Properties *****************/
        
    public final By SwitchIframe1 = By.cssSelector("#SidePanelIFrame");   
    public final By SwitchIframe2 = By.xpath("/html/body/div[2]/div[1]/div/iframe");                      
    public final By SwitchIframe3 = By.cssSelector("#app > div > div.ac > div.container > iframe");       
    public final By SwitchIframe4 = By.cssSelector("#fa526f12-8e2a-ed11-9db1-0022480a37ba > iframe");   
    public final By SwitchIframe5 = By.cssSelector("#contentIFrame0");                                   
    public final By SwitchIframe6 = By.cssSelector("#areaSolutionComponentFrame");     
    
    public final By IvrLogin_Button = By.cssSelector("#app > div > div.login > button");
    
    public final By IvrEmail_Button = By.cssSelector("#wdc_username");
    public final By IvrtPassword_Button = By.cssSelector("#wdc_password");
    public final By IvrSignInButton = By.cssSelector("#wdc_login_button");  
    public final By LoginErrorMessage = By.xpath("//*[text()='Authentication Failed']");  
    

    public final By LoginButtonError = By.xpath("  //*[@id=\"app\"]/div/div[1]/div/div[2]/div[2]");  
    
   
    public final By Ivr_Dropdown = By.xpath("//button[@id='agent-status-dropdown']//div[@class='button-content ButtonContent-sc-1aa0hna-2 bQpiCN']"); 
    public final By Available = By.cssSelector("div[class='ng-binding']");
    public final By ReceiveCall_Button = By.cssSelector("#root > div > div.FlexColumnContainer-sc-j7jy1s-1.PageWrapper-sc-bmg35s-1.gmTuAB > main > div.SoftphoneContactWrapper-sc-8jmund-0.ikGePO > div.SoftphoneWrapper-sc-c0eq56-0.ZVAKC > div.ContactActionBarWrapper-sc-18y6ycz-0.cIXJvS > div > button.ContactButton-sc-1lgrkqt-2.hClSQx.StyledButton-sc-1aa0hna-0.eZwNHY > div.button-content.ButtonContent-sc-1aa0hna-2.gPXylH"); 
    //public final By ReceiveCall_Button =By.cssSelector("#root > div > div.FlexColumnContainer-sc-j7jy1s-1.PageWrapper-sc-bmg35s-1.gmTuAB > main > div.SoftphoneContactWrapper-sc-8jmund-0.ikGePO > div.SoftphoneWrapper-sc-c0eq56-0.ZVAKC > div.ContactActionBarWrapper-sc-18y6ycz-0.cIXJvS > div > button.ContactButton-sc-1lgrkqt-2.hClSQx.StyledButton-sc-1aa0hna-0.eZwNHY > div.button-content.ButtonContent-sc-1aa0hna-2.gPXylH");
    public final By EndCall_Button = By.cssSelector("#root > div > div.FlexColumnContainer-sc-j7jy1s-1.PageWrapper-sc-bmg35s-1.gmTuAB > main > div.SoftphoneContactWrapper-sc-8jmund-0.ikGePO > div.SoftphoneWrapper-sc-c0eq56-0.ZVAKC > div.ContactActionBarWrapper-sc-18y6ycz-0.cIXJvS > div > div > button"); 
    //public final By EndCall_Button = By.cssSelector("#root > div > div.FlexColumnContainer-sc-j7jy1s-1.PageWrapper-sc-bmg35s-1.gmTuAB > main > div.SoftphoneContactWrapper-sc-8jmund-0.ikGePO > div.SoftphoneWrapper-sc-c0eq56-0.ZVAKC > div.ContactActionBarWrapper-sc-18y6ycz-0.cIXJvS > div > div > button");
    public final By CloseContact_Button = By.cssSelector(" #root > div > div.FlexColumnContainer-sc-j7jy1s-1.PageWrapper-sc-bmg35s-1.gmTuAB > main > div.SoftphoneContactWrapper-sc-8jmund-0.ikGePO > div.SoftphoneWrapper-sc-c0eq56-0.caPudF > div.Main-sc-c0eq56-2.hBZdDn > div > div:nth-child(2) > div > button.FullWidthContactButton-sc-16152hg-0.dgdjyT.StyledButton-sc-1aa0hna-0.cKdQSu"); 

     /****************      *********************/
    
    public final By Dismiss_Popup = By.cssSelector(" #connect-softphone-error-signalling-handshake-failure-title > div.FlexRowContainer-sc-j7jy1s-0.AlertWrapper-sc-956wbv-4.cvXlBW > button");
   
    public final By Menu = By.xpath("//*[@id=\"id-1\"]"); 
    //public final By Menu = By.xpath("//*[@data-id=\"navbutton\"]");
    
    public final By Contact_Button = By.xpath("//li[@aria-label='Contacts']//div[2]/span[2]");
   // public final By Saved_Contact = By.xpath("//*[@role='presentation'][normalize-space()='Rahull Sharma']");
    public final By Saved_Contact =By.xpath("//*[@role='presentation'][normalize-space()='Aarav Aacharya']");
   
    public final By Select_contact = By.xpath("//*[@aria-label='Select or deselect the row']");
  
    public final By Delete_contact = By.xpath("//*[@id=\"contact|NoRelationship|HomePageGrid|Mscrm.HomepageGrid.contact.DeleteMenu.Menu$button5\"]/span");
  
    public final By Delete_Popup_Button = By.xpath("//span[@id='confirmButtonText_11']");
    
    public final By Dial_Icon = By.xpath("//span[@id='id-e06af4d1-2812-45c7-a9c2-9fb73fee7bec-6-mobilephone4273edbd-ac1d-40d3-9fb2-095c621b552d-mobilephone.fieldControl-phone-action-icon']");
   
    /******************             *******************/    
    
      public final By Quick_Connect = By.xpath("/html/body/div[1]/div/div[2]/main/div[3]/button[1]");
    //public final By Quick_Connect=By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[3]/button[1]");
    
    
    public final By Dial_Pad = By.xpath("/html/body/div[1]/div/div[2]/main/div[3]/div/div[2]/div/div[4]/button[1]");
    
    public final By Dial_1 = By.xpath("/html/body/div[1]/div/div[2]/main/div[3]/div/div[2]/div/div[3]/div[2]/div/div[1]/button[1]");
    public final By Dial_4 = By.xpath(" /html/body/div[1]/div/div[2]/main/div[3]/div/div[2]/div/div[3]/div[2]/div/div[2]/button[1]");
    public final By Dial_0 = By.xpath(" /html/body/div[1]/div/div[2]/main/div[3]/div/div[2]/div/div[3]/div[2]/div/div[4]/button[2]");
    public final By Dial_3 = By.xpath(" /html/body/div[1]/div/div[2]/main/div[3]/div/div[2]/div/div[3]/div[2]/div/div[1]/button[3]");
    public final By Dial_9 = By.xpath(" /html/body/div[1]/div/div[2]/main/div[3]/div/div[2]/div/div[3]/div[2]/div/div[3]/button[3]");
    public final By Dial_11 = By.xpath(" //*[@id=\"root\"]/div/div[2]/main/div[3]/div/div[2]/div/div[3]/div[2]/div/div[1]/button[1]");
    public final By Dial_00 = By.xpath(" /html/body/div[1]/div/div[2]/main/div[3]/div/div[2]/div/div[3]/div[2]/div/div[4]/button[2]");
    public final By Dial_44 = By.xpath(" /html/body/div[1]/div/div[2]/main/div[3]/div/div[2]/div/div[3]/div[2]/div/div[2]/button[1]");
    public final By Dial_5 = By.xpath(" /html/body/div[1]/div/div[2]/main/div[3]/div/div[2]/div/div[3]/div[2]/div/div[2]/button[2]");
    public final By Dial_55 = By.xpath(" /html/body/div[1]/div/div[2]/main/div[3]/div/div[2]/div/div[3]/div[2]/div/div[2]/button[2]");
    public final By Dial_000 = By.xpath(" /html/body/div[1]/div/div[2]/main/div[3]/div/div[2]/div/div[3]/div[2]/div/div[4]/button[2]");
    
    public final By Call_Button = By.xpath(" /html/body/div[1]/div/div[2]/main/div[3]/div/div[2]/div/div[4]/button[2]");
    public final By Remove_NumberPAd = By.cssSelector("#root > div > div.FlexColumnContainer-sc-j7jy1s-1.PageWrapper-sc-bmg35s-1.gmTuAB > main > div.SoftphoneContactWrapper-sc-8jmund-0.ikGePO > div.SoftphoneWrapper-sc-c0eq56-0.ZVAKC > div.Main-sc-c0eq56-2.hBZdDn > div > div > div.FlexRowContainer-sc-j7jy1s-0.Header-sc-3df730-0.bpeqqs > button > div");
    public final By Number_Pad = By.xpath(" /html/body/div[1]/div/div[2]/main/div[3]/button[2]");        
    
    public final By Status_Dropdown = By.cssSelector("#agent-status-dropdown"); 
     //public final By Status_Dropdown= By.xpath("//*[@id=\"agent-status-dropdown\"]/div/div[3]");
    
    
    public final By Hold = By.xpath("//button[@aria-label='Hold']"); 
    //public final By Mute = By.cssSelector("//button[@aria-label='Mute']"); 
    public final By Mute = By.cssSelector("#root > div > div.FlexColumnContainer-sc-j7jy1s-1.PageWrapper-sc-bmg35s-1.gmTuAB > main > div.SoftphoneContactWrapper-sc-8jmund-0.ikGePO > div.SoftphoneWrapper-sc-c0eq56-0.ZVAKC > div.Main-sc-c0eq56-2.hBZdDn > div > div > button.SoftphoneButton-sc-1nzzs6d-0.Mute-sc-1nzzs6d-2.chduge.StyledButton-sc-1aa0hna-0.hCTPMj");
    public final By Resume = By.cssSelector("button[aria-label='Resume']"); 
    public final By Unmute = By.xpath("/html/body/div[1]/div/div[2]/main/div[3]/div[2]/div[2]/div/div[1]/button[2]");
   // public final By Numberpad = By.cssSelector("#root > div > div.FlexColumnContainer-sc-j7jy1s-1.PageWrapper-sc-bmg35s-1.gmTuAB > main > div.SoftphoneContactWrapper-sc-8jmund-0.ikGePO > div.SoftphoneWrapper-sc-c0eq56-0.ZVAKC > div.Main-sc-c0eq56-2.hBZdDn > div > div:nth-child(2) > button"); 
    public  final By Numberpad = By.cssSelector("#root > div > div.FlexColumnContainer-sc-j7jy1s-1.PageWrapper-sc-bmg35s-1.gmTuAB > main > div.SoftphoneContactWrapper-sc-8jmund-0.ikGePO > div.SoftphoneWrapper-sc-c0eq56-0.ZVAKC > div.Main-sc-c0eq56-2.hBZdDn > div > ul > li:nth-child(1) > div > button");
    public final By Remove_Popup = By.cssSelector("/html/body/div[1]/div/div[2]/main/div[3]/div/div[1]/button/div"); 
   
    
    
    
}