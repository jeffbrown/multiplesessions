package demo

class DemoController {

	def helperService

	def index() {

		helperService.doSomething()

		render(status: 200, text: 'OK', contentType: "text/html")
	}
}
