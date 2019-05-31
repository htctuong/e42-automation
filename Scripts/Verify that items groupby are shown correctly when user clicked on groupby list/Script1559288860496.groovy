import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

not_run: WebUI.callTestCase(findTestCase('Verify that chart detail is shown correctly when users click on chart canvas'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('http://ec2-35-173-20-238.compute-1.amazonaws.com/product/0dc357d6-fc15-4e1e-8bbe-7db8305208ae')

WebUI.click(findTestObject('groupbyList'))

item1 = WebUI.getText(findTestObject('groupbyItemList', [('i') : 1]))

item2 = WebUI.getText(findTestObject('groupbyItemList', [('i') : 2]))

item3 = WebUI.getText(findTestObject('groupbyItemList', [('i') : 3]))

item4 = WebUI.getText(findTestObject('groupbyItemList', [('i') : 4]))

item5 = WebUI.getText(findTestObject('groupbyItemList', [('i') : 5]))

item6 = WebUI.getText(findTestObject('groupbyItemList', [('i') : 6]))

item7 = WebUI.getText(findTestObject('groupbyItemList', [('i') : 7]))

item8 = WebUI.getText(findTestObject('groupbyItemList', [('i') : 8]))

item9 = WebUI.getText(findTestObject('groupbyItemList', [('i') : 9]))

item10 = WebUI.getText(findTestObject('groupbyItemList', [('i') : 10]))

WebUI.verifyTextPresent(item1, false)

WebUI.verifyTextPresent(item2, false)

WebUI.verifyTextPresent(item3, false)

WebUI.verifyTextPresent(item4, false)

WebUI.verifyTextPresent(item5, false)

WebUI.verifyTextPresent(item6, false)

WebUI.verifyTextPresent(item7, false)

WebUI.verifyTextPresent(item8, false)

WebUI.verifyTextPresent(item9, false)

WebUI.verifyTextPresent(item10, false)

WebUI.verifyTextPresent(item11, false)

