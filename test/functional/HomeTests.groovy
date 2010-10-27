import geb.Browser
import grails.plugin.geb.GebTests

class HomeTests extends GebTests {
    void testStandardGrailsIndexPage() {
        def browser = new Browser()
        browser.to(HomePage)
        assert browser.at(HomePage)
        // If I put the following assert in I get red line (syntax error) in IntelliJ
        assert browser.$('title').text() == 'Welcome to Grails'
        // and
        //        Running 1 functional test...
        //        Running test HomeTests...
        //                            testStandardGrailsIndexPage...FAILED
        //                            testStandardGrailsIndexPage...FAILED
        //                            testStandardGrailsIndexPage...FAILED
        //        Tests Completed in 472ms ...
        //        -------------------------------------------------------
        //        Tests passed: -2
        //        Tests failed: 3
        // when I run the tests which is weird

        assert browser.$('title').text() == 'Welcome to Grails'

        // However if I change it to the find method all is fine!
        assert browser.find('title').text() == 'Welcome to Grails'

        // yet I can do
        println browser.$('title').text()
        // and it does print the title       
    }
}