
find:
		@find . -type f -name "*.class"

clean:
		@echo "cleaning .class file."
		@rm -f ./*/*.class

.PHONY: clean

