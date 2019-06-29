/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.Evento;

/**
 * Response method for createEvento
 */
@CommandDescription(name="createEventoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createEventoResponse")
public interface CreateEventoResponse extends MessageHandler {

	void createEventoResponse(Evento response);
	
	void createEventoResponseError(ErrorPayload error);

}
