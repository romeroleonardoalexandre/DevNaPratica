package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import br.com.senior.messaging.model.EntityDescription;
import br.com.senior.messaging.model.EntityId;

@EntityDescription
public class Evento {
    
    public static class Id {
    	
        public String id;
        
        public Id() {
        }
        
        public Id(String eventoId) {
            this.id = eventoId;
        }
        
        public String getEventoId() {
            return id;
        }
        
        public String getId() {
            return id;
        }
        
    	public void normalize(Map<String, Object> headers) {
    		BasicoNormalizer.normalize(this, headers);
    	}
    	
    }
    
    public static class PagedResults {
    	public Long totalPages;
    	public Long totalElements;
    	
        public List<Evento> contents;
        
        public PagedResults() {
        }
        
        public PagedResults(List<Evento> contents) {
            this.contents = contents;
        }
        
        public PagedResults(List<Evento> contents, Long totalPages, Long totalElements) {
            this.contents = contents;
            this.totalPages = totalPages;
            this.totalElements = totalElements;
        }
    }
    
    public static class PageRequest {
        public Long offset;
        public Long size;
        public boolean translations;
        public String orderBy;
        public String filter;
        public List<String> displayFields;
        public boolean useCustomFilter;
        
        public PageRequest() {
        }
        
        public PageRequest(Long offset, Long size) {
            this(offset, size, null, null);
        }
        
        public PageRequest(Long offset, Long size, String orderBy) {
            this(offset, size, orderBy, null);
        }
        
        public PageRequest(Long offset, Long size, String orderBy, String filter) {
            this(offset, size, orderBy, filter, null);
       	}
       	
        public PageRequest(Long offset, Long size, String orderBy, String filter, List<String> displayFields) {
            this(offset, size, orderBy, filter, displayFields, false);
       	}
        
        public PageRequest(Long offset, Long size, String orderBy, String filter, List<String> displayFields, boolean useCustomFilter) {
        	this.offset = offset;
        	this.size = size;
        	this.orderBy = orderBy;
        	this.filter = filter;
        	this.displayFields = displayFields;
        	this.useCustomFilter = useCustomFilter;
        }
    }

    @EntityId
    public String id;
    public java.time.LocalDate data;
    public java.time.LocalTime hora;
    public String descricao;
    public Tipo tipo;
    public java.util.List<Sala> salas;
    
    public Evento() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Evento(String id, java.time.LocalDate data, java.time.LocalTime hora, String descricao, Tipo tipo, java.util.List<Sala> salas) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.tipo = tipo;
        this.salas = salas;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public Evento(java.time.LocalDate data, java.time.LocalTime hora, String descricao, Tipo tipo) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.tipo = tipo;
    }
    
    public void normalize(Map<String, Object> headers) {
    	BasicoNormalizer.normalize(this, headers);
    }
    
    public void validate() {
    	validate(true);
    }
    
    public void validate(boolean required) {
    	validate(null, true);
    }
    
    public void validate(Map<String, Object> headers, boolean required) {
    	validate(headers, required, new ArrayList<>());
    }
    
    void validate(Map<String, Object> headers, boolean required, List<Object> validated) {
    	BasicoValidator.validate(this, headers, required, validated);
    }
    @Override
    public int hashCode() {
        int ret = 1;
        if (id != null) {
            ret = 31 * ret + id.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Evento)) {
            return false;
        }
        Evento other = (Evento) obj;
        if ((id == null) != (other.id == null)) {
            return false;
        }
        if ((id != null) && !id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	toString(sb, new ArrayList<>());
    	return sb.toString();
    }
    
    void toString(StringBuilder sb, List<Object> appended) {
    	sb.append(getClass().getSimpleName()).append(" [");
    	if (appended.contains(this)) {
    		sb.append("<Previously appended object>").append(']');
    		return;
    	}
    	appended.add(this);
    	sb.append("id=").append(id == null ? "null" : id).append(", ");
    	sb.append("data=").append(data == null ? "null" : data).append(", ");
    	sb.append("hora=").append(hora == null ? "null" : hora).append(", ");
    	sb.append("descricao=").append(descricao == null ? "null" : descricao).append(", ");
    	sb.append("tipo=<");
    	if (tipo == null) {
    		sb.append("null");
    	} else {
    		tipo.toString(sb, appended);
    	}
    	sb.append('>').append(", ");
    	sb.append("salas=<");
    	if (salas == null) {
    		sb.append("null");
    	} else {
    		sb.append('[');
    		int last = salas.size() - 1;
    		for (int i = 0; i <= last; i++) {
    			salas.get(i).toString(sb, appended);
    			if (i < last) {
    				sb.append(", ");
    			}
    		}
    		sb.append(']');
    	}
    	sb.append('>');
    	sb.append(']');
    }
    
}