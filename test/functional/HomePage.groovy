import geb.Page

class HomePage extends Page {
    static url = "http://localhost:8080/geb-grails-example"
// Why doesn't this work? Thought grails plugin took care of base.
//    static url = "/"
}