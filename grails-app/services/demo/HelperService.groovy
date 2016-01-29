package demo

import grails.transaction.Transactional
import org.springframework.transaction.annotation.Propagation

@Transactional
class HelperService {

	def doSomething() {
		def person = Person.get(1)
//		person.discard()
		doSomethingElse(person)
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	def doSomethingElse(Person person) {
		person.save()
	}
}
