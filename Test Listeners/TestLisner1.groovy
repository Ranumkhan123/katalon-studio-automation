import com.kms.katalon.core.annotation.*
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.context.TestCaseContext

class ScreenshotListener {
    @AfterTestCase
    def afterTestCase(TestCaseContext testCaseContext) {
        if (testCaseContext.getTestCaseStatus() == "FAILED") {
            WebUI.takeScreenshot("Screenshots/Failed_" + testCaseContext.getTestCaseId() + ".png")
        } else {
            WebUI.takeScreenshot("Screenshots/Passed_" + testCaseContext.getTestCaseId() + ".png")
        }
    }
}
