package br.com.cadastro.services.validation;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import br.com.cadastro.domain.enums.TipoCliente;
import br.com.cadastro.dto.ClienteDTO;
import br.com.cadastro.repositories.ClienteRepository;
import br.com.cadastro.resources.exception.FieldMessage;
import br.com.cadastro.services.validation.util.BR;

public class ClienteUpadateValidator implements ConstraintValidator<ClienteUpdate, ClienteDTO> {

	private ClienteRepository repo;
	
	@Override
	public void initialize(ClienteUpdate ann) {

	}
	
	@Override
	public boolean isValid(ClienteDTO objDto, ConstraintValidatorContext context) {
		List<FieldMessage> list = new ArrayList<>();
		
//		Cliente aux = repo.findByEmail(objDto.getEmail());
//		if()
//		
		
		for(FieldMessage e : list) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
					.addConstraintViolation();
		}
		return list.isEmpty();
	}

}
