package school.cesar.unit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyString;

@ExtendWith(MockitoExtension.class)
public class MyApplicationMockedTest {

    @InjectMocks MyApplication application;
    @Mock MessageService service;

    @Test
    public void processMessage_sendMessageReturningTrue_true(){

        Message dummy = new Message();

        when(service.sendMessage(null, null)).thenReturn(false);
        Assertions.assertFalse(application.processMessage(dummy));

    }


    @Test
    public void processMessage_sendMessageWithMsg_True(){
        Message dummy = new Message("Hello world!", "mmcj@cesar.school");

        when(service.sendMessage(anyString(), anyString())).thenReturn(true);
        Assertions.assertTrue(application.processMessage(dummy));
        TN 2134640961 - cód rejeição 55
        TN 3532213766 - autorizada

    }




}
