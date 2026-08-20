Exercise: Notification Delivery System

Your company's app needs to send notifications to users through different channels — Email, SMS, and Push notifications. Right now the system only supports Email, but the product team just announced that SMS and Push are launching next quarter, and they've hinted that "WhatsApp integration" might come after that.

Each notification type has different content and delivery logic: Email notifications need a subject line and body, SMS notifications need to fit within a character limit, and Push notifications need a device token to target.

Build a system that can create and send the appropriate notification based on a given type, in a way that won't require modifying existing code every time a new channel is added.