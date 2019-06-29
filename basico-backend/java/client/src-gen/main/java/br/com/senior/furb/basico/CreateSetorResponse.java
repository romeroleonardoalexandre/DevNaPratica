/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.Setor;

/**
 * Response method for createSetor
 */
@CommandDescription(name="createSetorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createSetorResponse")
public interface CreateSetorResponse extends MessageHandler {

	void createSetorResponse(Setor response);
	
	void createSetorResponseError(ErrorPayload error);

}
