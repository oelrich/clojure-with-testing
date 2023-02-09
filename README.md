# Getting Started

In the root of the directory you can run the test or the program.

## Running the program

* `clj -M -m org.cwt.core`
* `clj -M -m org.cwt.core -h`
* `clj -M -m org.cwt.core -n 5`

## Developing

When jacking in (`Ctrl+Shift+P` then "Calva: Start a Project REPL and Connect ...") using the Calva extension, select `deps.edn` and then tick the `dev` checkbox. Then open [core.clj](src/org/cwt/core.clj) in the editor and use the extension again, now with "Calva: Load/Evaluate Current File ...". Now it should be possible to send snippets to the REPL and have the results appear in the editor. (Place the cursor at the end of line 11 and hit `Alt+Return` and some numbers should appear.)

### Testing

* `clj -M:test` to run all tests once.
* `clj -M:test --watch` to continuously look for changes and re-run tests.

### Updating dependencies

`clj -M:outdated` will check for outdated dependencies in [deps.edn](deps.edn).
