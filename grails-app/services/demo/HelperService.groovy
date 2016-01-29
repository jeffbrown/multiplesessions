package demo

import grails.transaction.Transactional
import org.springframework.transaction.annotation.Propagation

@Transactional
class HelperService {

	def doSomething() {
		def person = Person.get(1)
		person.name = 'new name'
		person.save()
		person.discard()
		doSomethingElse(person)
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	def doSomethingElse(Person person) {
		person.save()
		println "Name after save: ${person.name}"
	}
}
