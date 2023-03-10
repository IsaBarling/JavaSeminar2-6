package terminal.executable;

import terminal.Command;
import terminal.dislpayed.ResultDisplayed;
import terminal.dislpayed.ResultDisplayedFactory;

public class LoggingCommandExecutableFactory extends CommandExecutableFactoryImpl {
    @Override
    public CommandExecutable create(Command command) {
        System.out.println(command);

        CommandExecutable commandExecutable = super.create(command);

        ResultDisplayedFactory resultDisplayedFactory = new ResultDisplayedFactory();
        ResultDisplayed resultDisplayed = resultDisplayedFactory.create(command.getMainCommand(), commandExecutable);
        resultDisplayed.display();

        return commandExecutable;
    }
}
