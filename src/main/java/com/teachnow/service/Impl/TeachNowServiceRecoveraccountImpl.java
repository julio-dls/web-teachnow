/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teachnow.service.Impl;

import com.teachnow.domain.Persona;
import com.teachnow.repository.TeachNowRepositoryPersona;
import com.teachnow.service.TeachNowServicePersona;
import java.io.IOException;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teachnow.service.TeachNowServiceRecoveraccount;
import com.teachnow.service.TeachNowServiceToken;
import java.io.UnsupportedEncodingException;
import java.util.UUID;
import javax.mail.internet.MimeMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

/**
 *
 * @author jdls
 */
@Service
@Transactional
public class TeachNowServiceRecoveraccountImpl implements TeachNowServiceRecoveraccount {

    @Autowired
    private JavaMailSenderImpl mailSender;
    @Autowired
    private TeachNowRepositoryPersona teachNowRepositoryPersona;
    @Autowired
    TeachNowServicePersona teachNowServicePersona;
    @Autowired
    TeachNowServiceToken teachNowServiceToken;

    @Override
    public boolean sendmail(String to) throws AddressException, MessagingException, IOException {
        if (to == null) {
            throw new IllegalArgumentException("No se aceptan valores null.");
        }
        Integer idPersona = null;
        String dirEmail, plantilla, nombre = null;
        boolean exists = false;

        if (teachNowServicePersona.existsUser(to)) {
            Persona nPersona = teachNowRepositoryPersona.buscarPerfilPorUsername(to);
            dirEmail = nPersona.getPermiso().getUsername();
            nombre = nPersona.getNombre();
            idPersona = nPersona.getId();
            String token = getToken();
            
            teachNowServiceToken.addNewToken(idPersona, token);
            
            plantilla = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> <html style=\"width:100%;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0;\"> <head> <meta charset=\"UTF-8\"> <meta content=\"width=device-width, initial-scale=1\" name=\"viewport\"> <meta name=\"x-apple-disable-message-reformatting\"> <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> <meta content=\"telephone=no\" name=\"format-detection\"> <title>Nueva plantilla de correo electrónico 2020-04-23</title> <!--[if (mso 16)]><style type=\"text/css\">     a {text-decoration: none;}     </style><![endif]--> <!--[if gte mso 9]><style>sup { font-size: 100% !important; }</style><![endif]--> <!--[if !mso]><!-- --> <link href=\"https://fonts.googleapis.com/css?family=Lato:400,400i,700,700i\" rel=\"stylesheet\"> <!--<![endif]--> <style type=\"text/css\">\n"
                    + " @media only screen and (max-width:600px) {p, ul li, ol li, a { font-size:16px!important; line-height:150%!important } h1 { font-size:30px!important; text-align:center; line-height:120%!important } h2 { font-size:26px!important; text-align:center; line-height:120%!important } h3 { font-size:20px!important; text-align:center; line-height:120%!important } h1 a { font-size:30px!important } h2 a { font-size:26px!important } h3 a { font-size:20px!important } .es-menu td a { font-size:16px!important } .es-header-body p, .es-header-body ul li, .es-header-body ol li, .es-header-body a { font-size:16px!important } .es-footer-body p, .es-footer-body ul li, .es-footer-body ol li, .es-footer-body a { font-size:16px!important } .es-infoblock p, .es-infoblock ul li, .es-infoblock ol li, .es-infoblock a { font-size:12px!important } *[class=\"gmail-fix\"] { display:none!important } .es-m-txt-c, .es-m-txt-c h1, .es-m-txt-c h2, .es-m-txt-c h3 { \n"
                    + "text-align:center!important } .es-m-txt-r, .es-m-txt-r h1, .es-m-txt-r h2, .es-m-txt-r h3 { text-align:right!important } .es-m-txt-l, .es-m-txt-l h1, .es-m-txt-l h2, .es-m-txt-l h3 { text-align:left!important } .es-m-txt-r img, .es-m-txt-c img, .es-m-txt-l img { display:inline!important } .es-button-border { display:block!important } a.es-button { font-size:20px!important; display:block!important; border-width:15px 25px 15px 25px!important } .es-btn-fw { border-width:10px 0px!important; text-align:center!important } .es-adaptive table, .es-btn-fw, .es-btn-fw-brdr, .es-left, .es-right { width:100%!important } .es-content table, .es-header table, .es-footer table, .es-content, .es-footer, .es-header { width:100%!important; max-width:600px!important } .es-adapt-td { display:block!important; width:100%!important } .adapt-img { width:100%!important; height:auto!important } .es-m-p0 { padding:0px!important } .es-m-p0r { \n"
                    + "padding-right:0px!important } .es-m-p0l { padding-left:0px!important } .es-m-p0t { padding-top:0px!important } .es-m-p0b { padding-bottom:0!important } .es-m-p20b { padding-bottom:20px!important } .es-mobile-hidden, .es-hidden { display:none!important } .es-desk-hidden { display:table-row!important; width:auto!important; overflow:visible!important; float:none!important; max-height:inherit!important; line-height:inherit!important } .es-desk-menu-hidden { display:table-cell!important } table.es-table-not-adapt, .esd-block-html table { width:auto!important } table.es-social { display:inline-block!important } table.es-social td { display:inline-block!important } } #outlook a { 	padding:0; } .ExternalClass { 	width:100%; } .ExternalClass, .ExternalClass p, .ExternalClass span, .ExternalClass font, .ExternalClass td, .ExternalClass div { 	line-height:100%; } .es-button { 	mso-style-priority:100!important; 	text-decoration:none!important; } \n"
                    + "a[x-apple-data-detectors] { 	color:inherit!important; 	text-decoration:none!important; 	font-size:inherit!important; 	font-family:inherit!important; 	font-weight:inherit!important; 	line-height:inherit!important; } .es-desk-hidden { 	display:none; 	float:left; 	overflow:hidden; 	width:0; 	max-height:0; 	line-height:0; 	mso-hide:all; } </style> </head> <body style=\"width:100%;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;padding:0;Margin:0;\"> <div class=\"es-wrapper-color\" style=\"background-color:#F4F4F4;\"> <!--[if gte mso 9]><v:background xmlns:v=\"urn:schemas-microsoft-com:vml\" fill=\"t\"> <v:fill type=\"tile\" color=\"#f4f4f4\"></v:fill> </v:background><![endif]-->\n"
                    + " <table class=\"es-wrapper\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;padding:0;Margin:0;width:100%;height:100%;background-repeat:repeat;background-position:center top;\"> <tr class=\"gmail-fix\" height=\"0\" style=\"border-collapse:collapse;\"> <td style=\"padding:0;Margin:0;\"> <table width=\"600\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> <tr style=\"border-collapse:collapse;\"> <td cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"padding:0;Margin:0;line-height:1px;min-width:600px;\" height=\"0\">\n"
                    + "<img src=\"#\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;max-height:0px;min-height:0px;min-width:600px;width:600px;\" alt width=\"600\" height=\"1\"></td> </tr> </table></td> </tr> <tr style=\"border-collapse:collapse;\"> <td valign=\"top\" style=\"padding:0;Margin:0;\"> <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> <tr style=\"border-collapse:collapse;\"> <td style=\"padding:0;Margin:0;background-color:#83C58E;\" bgcolor=\"#83c58e\" align=\"center\"> <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\n"
                    + " <tr style=\"border-collapse:collapse;\"> <td align=\"left\" style=\"padding:0;Margin:0;\"> <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> <tr style=\"border-collapse:collapse;\"> <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:separate;border-spacing:0px;background-color:#FFFFFF;border-radius:4px;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" role=\"presentation\"> <tr style=\"border-collapse:collapse;\"> <td align=\"center\" bgcolor=\"#83c58e\" style=\"Margin:0;padding-bottom:5px;padding-left:30px;padding-right:30px;padding-top:35px;\"><h1 style=\"Margin:0;line-height:55px;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:46px;font-style:normal;font-weight:normal;color:#FFFFFF;\">\n"
                    + "Enseña Ya!</h1></td> </tr> <tr style=\"border-collapse:collapse;\"> <td bgcolor=\"#ffffff\" align=\"center\" style=\"Margin:0;padding-top:5px;padding-bottom:5px;padding-left:20px;padding-right:20px;font-size:0;\"> <table width=\"100%\" height=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> <tr style=\"border-collapse:collapse;\"> <td style=\"padding:0;Margin:0px;border-bottom:1px solid #FFFFFF;background:rgba(0, 0, 0, 0) none repeat scroll 0% 0%;height:1px;width:100%;margin:0px;\"></td> </tr> </table></td> </tr> </table></td> </tr> </table></td> </tr> </table></td> </tr> </table> <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> <tr style=\"border-collapse:collapse;\">\n"
                    + " <td align=\"center\" style=\"padding:0;Margin:0;\"> <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#FFFFFF;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" align=\"center\"> <tr style=\"border-collapse:collapse;\"> <td align=\"left\" style=\"padding:0;Margin:0;\"> <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> <tr style=\"border-collapse:collapse;\"> <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> <table style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:#FFFFFF;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"#ffffff\" role=\"presentation\"> <tr style=\"border-collapse:collapse;\">\n"
                    + " <td class=\"es-m-txt-l\" bgcolor=\"#ffffff\" align=\"left\" style=\"Margin:0;padding-bottom:15px;padding-top:20px;padding-left:30px;padding-right:30px;\"><p style=\"Margin:0;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-size:18px;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;line-height:27px;color:#666666;\"><strong>Hola " + nombre + " , ingresá&nbsp;a Enseña Ya y creá una nueva contraseña.</strong><br><br>Hemos generado el siguiente acceso con el podrás crear una nueva contraseña para tu cuenta.</p></td> </tr> </table></td> </tr> </table></td> </tr> <tr style=\"border-collapse:collapse;\"> <td align=\"left\" style=\"padding:0;Margin:0;padding-bottom:20px;padding-left:30px;padding-right:30px;\"> <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> <tr style=\"border-collapse:collapse;\">\n"
                    + " <td width=\"540\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> <tr style=\"border-collapse:collapse;\"> <td align=\"center\" style=\"Margin:0;padding-left:10px;padding-right:10px;padding-top:40px;padding-bottom:40px;\"><span class=\"es-button-border\" style=\"border-style:solid;border-color:#EC6D64;background:#83C58E;border-width:0px;display:inline-block;border-radius:2px;width:auto;\">\n"
                    + "<a href=\"http://localhost:8080/teachnow/renovate/renew/new?token=" + token + "&id=" + idPersona + "\" class=\"es-button\" target=\"_blank\" style=\"mso-style-priority:100 !important;text-decoration:none;-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:helvetica, 'helvetica neue', arial, verdana, sans-serif;font-size:20px;color:#FFFFFF;border-style:solid;border-color:#83C58E;border-width:15px 25px;display:inline-block;background:#83C58E;border-radius:2px;font-weight:normal;font-style:normal;line-height:24px;width:auto;text-align:center;\">Crear nueva contraseña</a></span></td> </tr> </table></td> </tr> </table></td> </tr> </table></td> </tr> </table> <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> <tr style=\"border-collapse:collapse;\"> <td align=\"center\" style=\"padding:0;Margin:0;\">\n"
                    + " <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> <tr style=\"border-collapse:collapse;\"> <td align=\"left\" style=\"padding:0;Margin:0;\"> <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> <tr style=\"border-collapse:collapse;\"> <td width=\"600\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> <tr style=\"border-collapse:collapse;\"> <td align=\"center\" style=\"Margin:0;padding-top:10px;padding-bottom:20px;padding-left:20px;padding-right:20px;font-size:0;\">\n"
                    + " <table width=\"100%\" height=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> <tr style=\"border-collapse:collapse;\"> <td style=\"padding:0;Margin:0px;border-bottom:1px solid #F4F4F4;background:rgba(0, 0, 0, 0) none repeat scroll 0% 0%;height:1px;width:100%;margin:0px;\"></td> </tr> </table></td> </tr> </table></td> </tr> </table></td> </tr> </table></td> </tr> </table> <table class=\"es-content\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;table-layout:fixed !important;width:100%;\"> <tr style=\"border-collapse:collapse;\"> <td align=\"center\" style=\"padding:0;Margin:0;\">\n"
                    + " <table class=\"es-content-body\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;background-color:transparent;\" width=\"600\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\"> <tr style=\"border-collapse:collapse;\"> <td align=\"left\" style=\"Margin:0;padding-left:20px;padding-right:20px;padding-top:30px;padding-bottom:30px;\"> <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> <tr style=\"border-collapse:collapse;\"> <td width=\"560\" valign=\"top\" align=\"center\" style=\"padding:0;Margin:0;\"> <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\" style=\"mso-table-lspace:0pt;mso-table-rspace:0pt;border-collapse:collapse;border-spacing:0px;\"> <tr style=\"border-collapse:collapse;\">\n"
                    + " <td class=\"es-infoblock made_with es-m-txt-c\" align=\"center\" style=\"padding:0;Margin:0;line-height:120%;font-size:0;color:#CCCCCC;\"><a target=\"_blank\" href=\"https://viewstripo.email/?utm_source=templates&utm_medium=email&utm_campaign=software2&utm_content=trigger_newsletter4\" style=\"-webkit-text-size-adjust:none;-ms-text-size-adjust:none;mso-line-height-rule:exactly;font-family:lato, 'helvetica neue', helvetica, arial, sans-serif;font-size:12px;text-decoration:underline;color:#CCCCCC;\"><img src=\"images/64951510234941531.png\" alt width=\"125\" height=\"56\" style=\"display:block;border:0;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;\"></a></td> </tr> </table></td> </tr> </table></td> </tr> </table></td> </tr> </table></td> </tr> </table> </div> </body>\n"
                    + " \n"
                    + "</html>";

            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");

            helper.setText(plantilla, true);
            helper.setTo(dirEmail);
            helper.setSubject("Recuperar Contraseña");
            helper.setFrom("no-reply@memorynotfound.com");
            mailSender.send(mimeMessage);
            exists = true;
        }
        return exists;
    }

    private String getToken() throws UnsupportedEncodingException {
        return UUID.randomUUID().toString();
    }
}
