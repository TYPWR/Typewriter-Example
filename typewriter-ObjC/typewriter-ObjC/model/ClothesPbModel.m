//
//  ClothesPbModel.m
//  Autogenerated by typewriter
//
//  Generation Date On 2018/01/08
//  Version: 1.0.0

#import "ClothesPbModel.h"
#import "ClothesPb.pbobjc.h"

@implementation ClothesPbModel
- (instancetype)init UNAVAILABLE_ATTRIBUTE
{
    NSAssert(NO, @"please use designed initializer instead!");
    return nil;
}
+ (nullable instancetype)modelWithClothesPb:(ClothesPb *)prototype objectId:(nullable NSString *)objectId
{
    return [[self alloc] initWithClothesPb:prototype objectId:objectId];
}
- (nullable instancetype)initWithClothesPb:(ClothesPb *)prototype objectId:(nullable NSString *)objectId
{
    NSParameterAssert(prototype);
    if (!(self = [super init])) {
        return nil;
    }
    [self propertyMapWithPrototype:prototype mapping:@{@"type" : @"type",
                                                       @"price" : @"price",
                                                       @"brand" : @"brand"}];
    self->_objectId = objectId;
    [ClothesPbModel unidirectionalDataflow:self objectId:self.objectId];
    return self;
}
@end

@implementation ClothesPbModel (Extension)
+ (void)unidirectionalDataflow:(ClothesPbModel *)model objectId:(NSString *)objectId
{
    // unidirectional data flow
}
@end